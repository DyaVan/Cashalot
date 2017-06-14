package com.cashalot.domain.appflow;


import com.cashalot.domain.actors.User;
import com.cashalot.domain.ad.Advertisement;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "views")
public class View {

    @Id
    private long id;

    @Column
    private Date date;

    @Column
    private Emotion emotion;

    @Column
    private boolean like;

    @Column
    private boolean dislike;

    @Column
    private String comment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertisementId",referencedColumnName = "id")
    private Advertisement ad;

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isDislike() {
        return dislike;
    }

    public void setDislike(boolean dislike) {
        this.dislike = dislike;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }
}
