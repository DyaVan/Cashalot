package com.cashalot.dto;


import java.util.Date;

public class OrderDTO {

    private Date orderDate;

    private String status; // processing - Approved - rejected - outdated

    private String rejectionComment;

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

    private int totalViews;

    private int viewsPerUser;

    private Long subjectId;

    private Long contentId;

    private Long quizId;

}
