package com.cashalot.dto;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class ContentDTO {

    @NotEmpty
    @Size(min = 3,max = 100)
    private String topic;

    @NotEmpty
    @Size(min = 3,max = 100)
    private String afterText;

    @NotEmpty
    @Size(min = 5,max = 5)
    private String contentType;

    @NotEmpty
    @Size(min = 3,max = 700)
    private String beforeText;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAfterText() {
        return afterText;
    }

    public void setAfterText(String afterText) {
        this.afterText = afterText;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBeforeText() {
        return beforeText;
    }

    public void setBeforeText(String beforeText) {
        this.beforeText = beforeText;
    }
}
