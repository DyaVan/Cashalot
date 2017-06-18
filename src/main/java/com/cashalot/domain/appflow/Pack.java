package com.cashalot.domain.appflow;


import com.cashalot.domain.actors.User;
import com.cashalot.domain.subject.Subject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "packs")
public class Pack {

    //id user array of userAnswers, array of ads, submited? approved?

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pack")
    private List<PackSlot> packSlots = new ArrayList();

    @Column
    private boolean submitted = false;

    @Column
    private boolean approved = false;

    /**
     * Date till which the pack can still be sent back to the user
     */
    @Column
    private Date expirationDate;

    /**
     * Date till which the pack is still located in the DB for checking answers,
     * but can be already expired and not convenient for sending to the user.
     */
    @Column
    private Date deletionDate;

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PackSlot> getPackSlots() {
        return packSlots;
    }

    public void setPackSlots(ArrayList<PackSlot> packSlots) {
        this.packSlots = packSlots;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(Date deletionDate) {
        this.deletionDate = deletionDate;
    }


}
