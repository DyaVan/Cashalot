package com.cashalot.domain.ad.content;


public abstract class AdContent {

    protected String topic;
    protected String beforeText;
    protected String afterText;
    protected final String contentType;

    protected AdContent(String topic, String beforeText, String afterText, String contentType) {
        this.contentType = this.getClass().getSimpleName();
        this.topic = topic;
        this.beforeText = beforeText;
        this.afterText = afterText;
    }

    protected AdContent(){
        this.contentType = this.getClass().getSimpleName();
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


}
