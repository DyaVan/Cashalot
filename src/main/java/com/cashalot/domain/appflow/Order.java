package com.cashalot.domain.appflow;


import com.cashalot.domain.actors.Advertiser;
import com.cashalot.domain.ad.AdContent;
import com.cashalot.domain.ad.Quiz;
import com.cashalot.domain.subject.Subject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private long id;

    @Column
    private Date orderDate;

    @Column
    private String status; // processing - Approved - rejected - outdated

    @Column
    private String rejectionComment;

    @Column
    private int cost;

    @Column
    private boolean ageLimited;

    @Column
    private byte minAge;

    @Column
    private byte maxAge;

    @Column
    private boolean sexLimited;

    /**
     * true if male
     */
    @Column
    private boolean sex;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private int totalViews;

    @Column
    private int viewsPerUser;

    @OneToOne(optional = false)
    @JoinColumn(name = "advertiserId", nullable = false)
    private Advertiser advertiser;

    @ManyToOne
    @JoinColumn(name = "subjectId", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "contentId", nullable = false)
    private AdContent content;

    @ManyToOne
    @JoinColumn(name = "quizId", nullable = false)
    private Quiz quiz;

}
