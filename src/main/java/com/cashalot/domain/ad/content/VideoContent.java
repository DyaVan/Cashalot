package com.cashalot.domain.ad.content;


public class VideoContent extends AdContent  {

    public VideoContent() {}

    public VideoContent(String topic, String beforeText, String afterText, String contentType) {
        super(topic, beforeText, afterText, contentType);
    }

    public String toJsonString() {
        return null;
    }
}


//http://htmlbook.ru/html/video