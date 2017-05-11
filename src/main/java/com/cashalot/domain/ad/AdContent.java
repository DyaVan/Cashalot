package com.cashalot.domain.ad;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdContent {

    @Id
    private long id;
    private String topic;
    private String beforeText;
    private String afterText;
    private String resource;
    private String contentType;

    private AdContent(String topic, String beforeText, String afterText, String contentType, String resource) {
        this.resource = resource;
        this.topic = topic;
        this.contentType = contentType;
        this.beforeText = beforeText;
        this.afterText = afterText;
    }

    private AdContent() {
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
