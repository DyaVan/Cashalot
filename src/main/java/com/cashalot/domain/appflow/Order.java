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
    @GeneratedValue
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

    @OneToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name = "advertiserId", nullable = false)
    private Advertiser advertiser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subjectId", nullable = false)
    private Subject subject;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contentId", nullable = false)
    private AdContent content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quizId", nullable = false)
    private Quiz quiz;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectionComment() {
        return rejectionComment;
    }

    public void setRejectionComment(String rejectionComment) {
        this.rejectionComment = rejectionComment;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isAgeLimited() {
        return ageLimited;
    }

    public void setAgeLimited(boolean ageLimited) {
        this.ageLimited = ageLimited;
    }

    public byte getMinAge() {
        return minAge;
    }

    public void setMinAge(byte minAge) {
        this.minAge = minAge;
    }

    public byte getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(byte maxAge) {
        this.maxAge = maxAge;
    }

    public boolean isSexLimited() {
        return sexLimited;
    }

    public void setSexLimited(boolean sexLimited) {
        this.sexLimited = sexLimited;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getViewsPerUser() {
        return viewsPerUser;
    }

    public void setViewsPerUser(int viewsPerUser) {
        this.viewsPerUser = viewsPerUser;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public AdContent getContent() {
        return content;
    }

    public void setContent(AdContent content) {
        this.content = content;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
