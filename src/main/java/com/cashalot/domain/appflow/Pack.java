package com.cashalot.domain.appflow;


import com.cashalot.domain.actors.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pack {

    //id user array of userAnswers, array of ads, submited? approved?

    @Id
    private long id;
    private User user;
    private PackSlot[] packSlots = new PackSlot[7];

    boolean submitted = false;
    boolean approved = false;

    /**
     * Date till which the pack can still be sent back to the user
     */
    private Date expirationDate;

    /**
     * Date till which the pack is still located in the DB, but can be already
     * expired and not convenient for sending to the user.
     */
    private Date deletionDate;


}
