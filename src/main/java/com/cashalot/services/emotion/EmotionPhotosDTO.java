package com.cashalot.services.emotion;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmotionPhotosDTO implements Serializable {

    public EmotionPhotosDTO() {
    }

    public EmotionPhotosDTO(List<PhotoItem> photos) {
        this.photos = photos;
    }

    List<PhotoItem> photos = new ArrayList<>();

    public List<PhotoItem> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoItem> photos) {
        this.photos = photos;
    }

    static class PhotoItem implements Serializable {

        public PhotoItem() {
        }

        String id;
        String base64;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBase64() {
            return base64;
        }

        public void setBase64(String base64) {
            this.base64 = base64;
        }

        public PhotoItem(String id, String base64) {
            this.id = id;
            this.base64 = base64;
        }

        public PhotoItem(Integer id, String base64) {
            this.id = id.toString();
            this.base64 = base64;
        }
    }

}
