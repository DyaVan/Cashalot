package com.cashalot.domain;


import com.cashalot.domain.ad.Advertisement;

public class Pack {

    //id user array of userAnswers, array of ads, submited? approved?

    static long idCount = 1;

    private final long id;
    private User user;
    Advertisement[] ads = new Advertisement[7];
    String[] userAnswers = new String[7];

    boolean submitted = false;
    boolean approved = false;


}
