CREATE DATABASE `cashalotdb` /*!40100 DEFAULT CHARACTER SET utf8 */;


CREATE TABLE `cashalotdb`.`tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '0',
  `sex` tinyint(4) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`advertisers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emailLogin` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `weblink` varchar(120) DEFAULT NULL,
  `telephone` varchar(20) NOT NULL,
  `additionalInfo` varchar(500) DEFAULT NULL,
  `notACompany` tinyint(1) NOT NULL,
  `emailContact` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `emailLogin_UNIQUE` (`emailLogin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `cashalotdb`.`categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`contents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic` varchar(45) NOT NULL,
  `beforeText` varchar(300) DEFAULT NULL,
  `afterText` varchar(300) DEFAULT NULL,
  `resource` varchar(200) NOT NULL,
  `contentType` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`interests` (
  `userId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`categoryId`),
  KEY `FK_interest_category_idx` (`categoryId`),
  CONSTRAINT `FK_interest_category` FOREIGN KEY (`categoryId`) REFERENCES `categories` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_interest_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`packs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `submitted` tinyint(4) NOT NULL,
  `approved` tinyint(4) NOT NULL,
  `expirationDate` date NOT NULL,
  `deletionDate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_pack_user_idx` (`userId`),
  CONSTRAINT `FK_pack_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`packslots` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `packId` int(11) NOT NULL,
  `slotNumber` int(11) NOT NULL,
  `advertisementId` int(11) NOT NULL,
  `userAnswer` varchar(100) DEFAULT NULL,
  `emotion` varchar(15) DEFAULT NULL,
  `comment` varchar(250) DEFAULT NULL,
  `answerDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_packSlot_pack_idx` (`packId`),
  CONSTRAINT `FK_packSlot_pack` FOREIGN KEY (`packId`) REFERENCES `packs` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`quizzes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `questionText` varchar(200) NOT NULL,
  `answerOptions` varchar(250) NOT NULL,
  `answer` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`referallinks` (
  `inviterId` int(11) NOT NULL,
  `inviteeId` int(11) NOT NULL,
  PRIMARY KEY (`inviterId`,`inviteeId`),
  KEY `FK_referalLink_invitee_idx` (`inviteeId`),
  CONSTRAINT `FK_referalLink_invitee` FOREIGN KEY (`inviteeId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_referalLink_inviter` FOREIGN KEY (`inviterId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productInfo` varchar(1000) DEFAULT NULL,
  `webLink` varchar(120) DEFAULT NULL,
  `advertiserId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_subject_advertiser_idx` (`advertiserId`),
  KEY `FK_subject_category_idx` (`categoryId`),
  CONSTRAINT `FK_subject_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_subject_category` FOREIGN KEY (`categoryId`) REFERENCES `categories` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`subscriptions` (
  `userId` int(11) NOT NULL,
  `advertiserId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`advertiserId`),
  KEY `FK_subcription_advertiser_idx` (`advertiserId`),
  CONSTRAINT `FK_subcription_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_subcription_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`tagbindings` (
  `tagId` int(11) NOT NULL,
  `subjectId` int(11) NOT NULL,
  PRIMARY KEY (`tagId`,`subjectId`),
  KEY `FK_tagBinding_subject_idx` (`subjectId`),
  CONSTRAINT `FK_tagBinding_subject` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tagBinding_tag` FOREIGN KEY (`tagId`) REFERENCES `tags` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`advertisements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cost` int(11) NOT NULL,
  `sexLimited` tinyint(4) NOT NULL DEFAULT '0',
  `sex` tinyint(4) DEFAULT NULL,
  `ageLimited` tinyint(4) NOT NULL DEFAULT '0',
  `maxAge` int(11) DEFAULT NULL,
  `minAge` int(11) DEFAULT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `prepaidViews` int(11) NOT NULL DEFAULT '0',
  `approvedViews` int(11) NOT NULL DEFAULT '0',
  `sent` int(11) NOT NULL DEFAULT '0',
  `viewsPerUser` int(11) DEFAULT NULL,
  `subjectId` int(11) DEFAULT NULL,
  `contentId` int(11) DEFAULT NULL,
  `quizId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_advertisement_subject_idx` (`subjectId`),
  KEY `FK_advertisement_quiz_idx` (`quizId`),
  KEY `FK_advertisement_content_idx` (`contentId`),
  CONSTRAINT `FK_advertisement_content` FOREIGN KEY (`contentId`) REFERENCES `contents` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_advertisement_quiz` FOREIGN KEY (`quizId`) REFERENCES `quizzes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_advertisement_subject` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `cashalotdb`.`bookmarks` (
  `userId` int(11) NOT NULL,
  `advertisementId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`advertisementId`),
  KEY `FK_bookmark_advertisement_idx` (`advertisementId`),
  CONSTRAINT `FK_bookmark_advertisement` FOREIGN KEY (`advertisementId`) REFERENCES `advertisements` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_bookmark_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `cashalotdb`.`views` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `advertisementId` int(11) NOT NULL,
  `date` date NOT NULL,
  `emotion` varchar(15) DEFAULT NULL,
  `like` tinyint(4) DEFAULT '0',
  `dislike` tinyint(4) DEFAULT '0',
  `comment` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_view_user_idx` (`userId`),
  KEY `FK_view_advertisement_idx` (`advertisementId`),
  CONSTRAINT `FK_view_advertisement` FOREIGN KEY (`advertisementId`) REFERENCES `advertisements` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_view_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalotdb`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userEmail` VARCHAR(50) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `role_UNIQUE` (`role` ASC),
  INDEX `FK_role_user_idx` (`userEmail` ASC),
  CONSTRAINT `FK_role_user`
  FOREIGN KEY (`userEmail`)
  REFERENCES `cashalotdb`.`users` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


