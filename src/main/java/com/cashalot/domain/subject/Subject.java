package com.cashalot.domain.subject;

import com.cashalot.domain.actors.Advertiser;

import javax.persistence.*;
import java.util.List;


//в базе будет искть по рекламируемому продукту, то есть по Subject
@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String productInfo;

    @Column
    private String webLink;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertiserId", nullable = false)
    private Advertiser advertiser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tagbindings",
            joinColumns = @JoinColumn(name = "subjectId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tagId", referencedColumnName = "id"))
    private List<Tag> tags;

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
