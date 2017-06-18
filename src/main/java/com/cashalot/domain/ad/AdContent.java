package com.cashalot.domain.ad;


import com.cashalot.domain.actors.Advertiser;

import javax.persistence.*;

@Entity
@Table(name = "contents")
public class AdContent {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String topic;

    @Column
    private String afterText;

    @Column
    private String contentType;

    @Column
    private String beforeText;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertiserId", referencedColumnName = "id")
    private Advertiser advertiser;

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    protected void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setBeforeText(String beforeText) {
        this.beforeText = beforeText;
    }

    public void setAfterText(String afterText) {
        this.afterText = afterText;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public final String getContentType() {
        return contentType;
    }

    public String getTopic() {
        return topic;
    }


    public String getBeforeText() {
        return beforeText;
    }


    public String getAfterText() {
        return afterText;
    }

    public String toJsonString() {
        throw new UnsupportedOperationException();
    }

}

//http://htmlbook.ru/html/video
