package com.cashalot.domain;

import java.util.List;

/**
 * Created by VA-N_ on 19.04.2017.
 */

//в базе будет искть по рекламируемому продукту, то есть по Subject
public class Subject {

    private String productInfo;
    private String webLink;
    private Advertiser advertiser;
    private Category category;
    private List<String> tags;

}
