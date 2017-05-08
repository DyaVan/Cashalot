package com.cashalot.domain;


import com.cashalot.domain.ad.Advertisement;

import java.util.Date;

public class View {

    static long idCount = 1;

    private final long id = idCount++;
    private User user;
    private Advertisement ad;
    private Date date;
    private Emotion emotion;
    private boolean like;
    private boolean dislike;
    private String comment;
}
