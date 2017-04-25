package com.cashalot.domain;

import java.util.List;

/**
 * Created by VA-N_ on 19.04.2017.
 */

//в базе будет искть по рекламируемому продукту, то есть по Subject
public class Subject {

    static long idCount = 1;

    private final long id;
    private String productInfo;
    private String webLink;
    private Advertiser advertiser;
    private Category category;

    private List<String> tags;

    public Subject(String productInfo, String webLink, Advertiser advertiser, Category category) {
        this.id = idCount++;
        this.productInfo = productInfo;
        this.webLink = webLink;
        this.advertiser = advertiser;
        this.category = category;
    }

    public Subject(String productInfo, String webLink, Advertiser advertiser, Category category, List<String> tags) {
        this.id = idCount++;
        this.productInfo = productInfo;
        this.webLink = webLink;
        this.advertiser = advertiser;
        this.category = category;
        this.tags = tags;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

}
