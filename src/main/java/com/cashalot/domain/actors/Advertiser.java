package com.cashalot.domain.actors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Advertiser {

    @Id
    private long id;
    private String emailLogin;
    private String emailContact;
    private String name;
    private String webLink;
    private String telephone;
    private String additionalInfo;
    private boolean notACompany;

    //todo основные категории рекламодателя и вторичные, шоб на них можно было сразу подписаться



}
