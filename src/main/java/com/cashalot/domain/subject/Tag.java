package com.cashalot.domain.subject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tag {

    @Id
    private long id;
    private String name;
}
