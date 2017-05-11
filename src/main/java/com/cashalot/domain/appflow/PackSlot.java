package com.cashalot.domain.appflow;

import com.cashalot.domain.ad.Advertisement;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PackSlot {

    @Id
    private long id;
    private long packId;
    /**
     * slotNumber - number of this slot in the pack slots-array.
     */
    private byte slotNumber;
    private Advertisement ad;
    private String userAnswer;
    private Date answerDate;
    private Emotion emotion;
    private String comment;

}
