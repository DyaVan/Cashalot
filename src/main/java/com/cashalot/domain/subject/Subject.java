package com.cashalot.domain.subject;

import com.cashalot.domain.actors.Advertiser;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


//в базе будет искть по рекламируемому продукту, то есть по Subject
@Entity
public class Subject {

    @Id
    private long id;
    private String productInfo;
    private String webLink;
    private Advertiser advertiser;
    private Category category;

    private List<Tag> tags;


}
