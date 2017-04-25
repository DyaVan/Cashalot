package com.cashalot.domain.ad.content;

/**
 * Created by Ivan_Diachuk on 4/25/2017.
 */
public class VideoContent extends AdContent  {

    public VideoContent() {}

    public VideoContent(String topic, String beforeText, String afterText, String contentType) {
        super(topic, beforeText, afterText, contentType);
    }

    public String toJsonString() {
        return null;
    }
}
