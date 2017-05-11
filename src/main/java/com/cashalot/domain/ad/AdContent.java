package com.cashalot.domain.ad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    private AdContent(String topic, String beforeText, String afterText, String contentType, String resource) {
        this.resource = resource;
        this.topic = topic;
        this.contentType = contentType;
        this.beforeText = beforeText;
        this.afterText = afterText;
    }

    private AdContent() {
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
