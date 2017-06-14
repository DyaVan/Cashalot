CREATE TABLE `cashalot2`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(70) NULL,
  `email` VARCHAR(70) NOT NULL,
  `age` INT NULL,
  `sex` TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));

CREATE TABLE `cashalot2`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `roleName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `roleName_UNIQUE` (`roleName` ASC));

CREATE TABLE `cashalot2`.`advertisers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `emailLogin` VARCHAR(70) NOT NULL,
  `emailContact` VARCHAR(70) NULL,
  `name` VARCHAR(70) NOT NULL,
  `webLink` VARCHAR(250) NULL,
  `telephone` VARCHAR(20) NULL,
  `additionalInfo` VARCHAR(700) NULL,
  `notACompany` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `emailLogin_UNIQUE` (`emailLogin` ASC));

CREATE TABLE `cashalot2`.`authdetails` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(70) NOT NULL,
  `enabled` TINYINT NOT NULL DEFAULT 1,
  `password` VARCHAR(70) NOT NULL,
  `roleId` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));


CREATE TABLE `cashalot2`.`categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `cashalot2`.`subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(70) DEFAULT NULL,
  `productInfo` varchar(1000) DEFAULT NULL,
  `webLink` varchar(120) DEFAULT NULL,
  `advertiserId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_subject_category_idx` (`categoryId`),
  KEY `FK_subject_advertiser_idx` (`advertiserId`),
  CONSTRAINT `FK_subject_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_subject_category` FOREIGN KEY (`categoryId`) REFERENCES `categories` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalot2`.`contents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic` varchar(45) NOT NULL,
  `beforeText` varchar(300) DEFAULT NULL,
  `afterText` varchar(300) DEFAULT NULL,
  `resource` varchar(200) NOT NULL,
  `contentType` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `quizzes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `advertiserId` int(11) NOT NULL,
  `questionText` varchar(200) NOT NULL,
  `answerOptions` varchar(250) NOT NULL,
  `answer` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_quiz_advertiser_idx` (`advertiserId`),
  CONSTRAINT `FK_quiz_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `cashalot2`.`advertisements` (
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
  `subjectId` int(11) NOT NULL,
  `contentId` int(11) NOT NULL,
  `quizId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_advertisement_subject_idx` (`subjectId`),
  KEY `FK_advertisement_quiz_idx` (`quizId`),
  KEY `FK_advertisement_content_idx` (`contentId`),
  CONSTRAINT `FK_advertisement_content` FOREIGN KEY (`contentId`) REFERENCES `contents` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_advertisement_quiz` FOREIGN KEY (`quizId`) REFERENCES `quizzes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_advertisement_subject` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalot2`.`bookmarks` (
  `userId` int(11) NOT NULL,
  `advertisementId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`advertisementId`),
  KEY `FK_bookmark_advertisement_idx` (`advertisementId`),
  CONSTRAINT `FK_bookmark_advertisement` FOREIGN KEY (`advertisementId`) REFERENCES `advertisements` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_bookmark_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cashalot2`.`interests` (
  `userId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`categoryId`),
  KEY `FK_interest_category_idx` (`categoryId`),
  CONSTRAINT `FK_interest_category` FOREIGN KEY (`categoryId`) REFERENCES `categories` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `advertiserId` int(11) NOT NULL,
  `subjectId` int(11) NOT NULL,
  `quizId` int(11) NOT NULL,
  `contentId` int(11) NOT NULL,
  `cost` int(11) NOT NULL,
  `sexLimited` tinyint(4) NOT NULL DEFAULT '0',
  `sex` tinyint(4) DEFAULT NULL,
  `ageLimited` tinyint(4) NOT NULL DEFAULT '0',
  `maxAge` int(11) DEFAULT NULL,
  `minAge` int(11) DEFAULT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `totalViews` int(11) NOT NULL DEFAULT '0',
  `viewsPerUser` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  `rejectionComment` varchar(200) DEFAULT NULL,
  `orderDate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_order_quiz_idx` (`quizId`),
  KEY `FK_order_subject_idx` (`subjectId`),
  KEY `FK_order_content_idx` (`contentId`),
  KEY `FK_order_advertiser_idx` (`advertiserId`),
  CONSTRAINT `FK_order_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_order_content` FOREIGN KEY (`contentId`) REFERENCES `contents` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_order_quiz` FOREIGN KEY (`quizId`) REFERENCES `quizzes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_order_subject` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `packs` (
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


CREATE TABLE `cashalot2`.`packslots` (
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


CREATE TABLE `referallinks` (
  `inviterId` int(11) NOT NULL,
  `inviteeId` int(11) NOT NULL,
  PRIMARY KEY (`inviterId`,`inviteeId`),
  KEY `FK_invitee_idx` (`inviteeId`),
  CONSTRAINT `FK_invitee` FOREIGN KEY (`inviteeId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_inviter` FOREIGN KEY (`inviterId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `subscriptions` (
  `userId` int(11) NOT NULL,
  `advertiserId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`advertiserId`),
  KEY `FK_subscription_advertiser_idx` (`advertiserId`),
  CONSTRAINT `FK_subscription_advertiser` FOREIGN KEY (`advertiserId`) REFERENCES `advertisers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_subscription_user` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `cashalot2`.`tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `cashalot2`.`tagbindings` (
  `tagId` int(11) NOT NULL,
  `subjectId` int(11) NOT NULL,
  PRIMARY KEY (`tagId`,`subjectId`),
  KEY `FK_tagBinding_subject_idx` (`subjectId`),
  CONSTRAINT `FK_tagBinding_subject` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tagBinding_tag` FOREIGN KEY (`tagId`) REFERENCES `tags` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `views` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `advertisementId` int(11) NOT NULL,
  `date` date NOT NULL,
  `emotion` varchar(15) DEFAULT NULL,
  `like` tinyint(4) DEFAULT '0',
  `dislike` tinyint(4) DEFAULT '0',
  `comment` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_view_advertisement_idx` (`advertisementId`),
  KEY `FK_view_user_idx` (`userId`),
  CONSTRAINT `FK_view_advertisement` FOREIGN KEY (`advertisementId`) REFERENCES `advertisements` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_view_user` FOREIGN KEY (`userId`) REFERENCES `views` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


