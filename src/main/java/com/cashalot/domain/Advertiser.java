package com.cashalot.domain;


public class Advertiser {

    static long idCount = 1;

    private final long id;

    private String name;
    private String webLink;
    private String telephone;
    private String email;
    private String additionalInfo;
    private boolean notACompany;

    public Advertiser(String name, String webLink, String telephone, String email, String additionalInfo, boolean notACompany) {
        this.id = idCount++;
        this.name = name;
        this.webLink = webLink;
        this.telephone = telephone;
        this.email = email;
        this.additionalInfo = additionalInfo;
        this.notACompany = notACompany;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
