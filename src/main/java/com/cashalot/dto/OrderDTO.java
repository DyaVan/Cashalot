package com.cashalot.dto;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OrderDTO {


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

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    private int totalViews;

    private int viewsPerUser;

    private Long subjectId;

    private Long contentId;

    private Long quizId;

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

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
