package com.cashalot.domain.subject;

import com.cashalot.domain.actors.Advertiser;

import java.util.List;


//в базе будет искть по рекламируемому продукту, то есть по Subject
public class Subject {

    private long id;
    private String productInfo;
    private String webLink;
    private Advertiser advertiser;
    private Category category;

    private List<Tag> tags;


}
