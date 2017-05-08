package com.cashalot.domain;


import com.cashalot.domain.ad.Advertisement;

import java.util.Date;

public class Pack {

    //id user array of userAnswers, array of ads, submited? approved?

    static long idCount = 1;

    private final long id;
    private User user;
    Advertisement[] ads = new Advertisement[7];
    String[] userAnswers = new String[7];

    boolean submitted = false;
    boolean approved = false;

    /**
     * Date till which the pack can still be sent back to the user
     */
    private Date expirationDate;

    /**
     * Date till which the pack is still located in the DB, but can be already
     * expired and not convenient for sending to the user.
     */
    private Date deletionDate;


}
