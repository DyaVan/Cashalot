package com.cashalot.domain.appflow;


import com.cashalot.domain.actors.User;
import com.cashalot.domain.ad.Advertisement;

import java.util.Date;

public class View {

    private long id;
    private User user;
    private Advertisement ad;
    private Date date;
    private Emotion emotion;
    private boolean like;
    private boolean dislike;
    private String comment;
}
