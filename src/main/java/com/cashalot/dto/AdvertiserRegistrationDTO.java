package com.cashalot.dto;


import com.cashalot.validation.annotations.UniqueEmail;
import com.cashalot.validation.annotations.ValidEmail;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdvertiserRegistrationDTO {

    @ValidEmail
    @UniqueEmail
    private String emailLogin;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String password;

    @ValidEmail
    private String emailContact;

    @NotEmpty
    @Size(min = 2, max = 70)
    private String name;

    @Size(max = 250)
    private String webLink;

    @NotEmpty
    @Size(min = 10, max = 50)
    private String telephone;

    @Size( max = 2000)
    private String additionalInfo;

    @NotNull
    private Boolean notACompany;

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Boolean getNotACompany() {
        return notACompany;
    }

    public void setNotACompany(Boolean notACompany) {
        this.notACompany = notACompany;
    }
}
