package com.cashalot.domain.appflow;

import com.cashalot.domain.ad.Advertisement;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "packslots")
public class PackSlot {

    @Id
    @GeneratedValue
    private long id;

    /**
     * slotNumber - number of this slot in the pack slots-array.
     */
    @Column
    private byte slotNumber;

    @Column
    private String userAnswer;

    @Column
    private Date answerDate;

    @Column
    private Emotion emotion;

    @Column
    private String comment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packId",referencedColumnName = "id")
    private Pack pack;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertisementId",referencedColumnName = "id")
    private Advertisement ad;

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public byte getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(byte slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }


}
