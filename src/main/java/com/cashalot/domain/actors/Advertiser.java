package com.cashalot.domain.actors;

import javax.persistence.*;

@Entity
@Table(name = "advertisers")
public class Advertiser {

    @Id
    private long id;
    @Column
    private String emailLogin;
    @Column
    private String emailContact;
    @Column
    private String name;
    @Column
    private String webLink;
    @Column
    private String telephone;
    @Column
    private String additionalInfo;
    @Column
    private boolean notACompany;

    //todo основные категории рекламодателя и вторичные, шоб на них можно было сразу подписаться


    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean isNotACompany() {
        return notACompany;
    }

    public void setNotACompany(boolean notACompany) {
        this.notACompany = notACompany;
    }
}
