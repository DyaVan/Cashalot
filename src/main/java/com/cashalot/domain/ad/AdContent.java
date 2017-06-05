package com.cashalot.domain.ad;


import com.cashalot.domain.actors.Advertiser;

import javax.persistence.*;

@Entity
@Table(name = "contents")
public class AdContent {

    @Id
    private long id;

    @Column
    private String topic;

    @Column
    private String afterText;

    @Column
    private String resource;

    @Column
    private String contentType;

    @Column
    private String beforeText;

    @ManyToOne
    @JoinColumn(name = "advertiserId", nullable = false)
    private Advertiser advertiser;

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

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getResource() {
        return resource;
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

    public  String toJsonString(){
        throw new UnsupportedOperationException();
    }

}

//http://htmlbook.ru/html/video
