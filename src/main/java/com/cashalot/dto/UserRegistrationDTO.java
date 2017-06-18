package com.cashalot.dto;


import com.cashalot.validation.annotations.UniqueEmail;
import com.cashalot.validation.annotations.ValidEmail;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegistrationDTO {

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @ValidEmail
    @UniqueEmail
    private String email;

    @NotNull
    @Min(12)
    @Max(120)
    private Integer age;


    @NotEmpty
    @Size(min = 5, max = 50)
    private String password;

    /**
     * true if male
     */
    @NotNull
    private Boolean sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
