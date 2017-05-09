package com.cashalot.domain.ad;

import com.cashalot.domain.subject.Subject;

import java.util.Date;


public class Advertisement {

    private long id;
    private Subject subject;
    private AdContent content;
    private Quiz quiz;

    private int cost;
    private boolean ageLimited;
    private byte minAge;
    private byte maxAge;
    private boolean sexLimited;
    /**
     * true if male
     */
    private boolean sex;

    private Date startDate;
    private Date endDate;

    //todo SYNCHRONIZATION Atomics? volatile? synchronized? dedicated thread?
    private int prepaidViews;
    private int approvedViews;
    private int sent;
    private int viewsPerUser;


}
