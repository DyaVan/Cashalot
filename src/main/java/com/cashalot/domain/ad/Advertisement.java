package com.cashalot.domain.ad;

import com.cashalot.domain.actors.Advertiser;
import com.cashalot.domain.subject.Subject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "advertisements")
public class Advertisement {

    @Id
    private long id;

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

    //todo SYNCHRONIZATION Atomics? volatile? synchronized? dedicated thread?
    @Column
    private int prepaidViews;

    @Column
    private int approvedViews;

    @Column
    private int sent;

    @Column
    private int viewsPerUser;

    @ManyToOne
    @JoinColumn(name = "subjectId", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "contentId", nullable = false)
    private AdContent content;


    @ManyToOne
    @JoinColumn(name = "quizId", nullable = false)
    private Quiz quiz;


    protected void setId(long id) {
        this.id = id;
    }

    public long getId() {

        return id;
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

    public int getPrepaidViews() {
        return prepaidViews;
    }

    public void setPrepaidViews(int prepaidViews) {
        this.prepaidViews = prepaidViews;
    }

    public int getApprovedViews() {
        return approvedViews;
    }

    public void setApprovedViews(int approvedViews) {
        this.approvedViews = approvedViews;
    }

    public int getSent() {
        return sent;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public int getViewsPerUser() {
        return viewsPerUser;
    }

    public void setViewsPerUser(int viewsPerUser) {
        this.viewsPerUser = viewsPerUser;
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
