package com.cashalot.domain;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by VA-N_ on 19.04.2017.
 */
public class User {

    private long id;
    private String name;

    private List<Advertiser> subscriptions = new ArrayList<Advertiser>();
    private List<Category> interests = new ArrayList<Category>();

}
