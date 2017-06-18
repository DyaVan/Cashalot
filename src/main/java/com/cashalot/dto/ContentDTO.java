package com.cashalot.dto;


import com.cashalot.validation.annotations.ValidMediaFile;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Size;

public class ContentDTO {

    @NotEmpty
    @Size(min = 3,max = 100)
    private String topic;

    @Size(max = 700)
    private String afterText;

    @NotEmpty
    @Size(min = 5,max = 5)
    private String contentType;

    @Size(max = 700)
    private String beforeText;

    @ValidMediaFile
    private MultipartFile mediaFile;

    public MultipartFile getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(MultipartFile mediaFile) {
        this.mediaFile = mediaFile;
    }

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
