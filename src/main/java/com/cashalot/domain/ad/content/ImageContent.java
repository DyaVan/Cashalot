package com.cashalot.domain.ad.content;


public class ImageContent extends AdContent  {

    public ImageContent() {}

    public ImageContent(String topic, String beforeText, String afterText, String contentType) {
        super(topic, beforeText, afterText, contentType);
    }

    public String toJsonString() {
        return null;
    }

}
