package com.cashalot.services.emotion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmotionPhotosDTO {

    List<PhotoItem> photos = new ArrayList<>();


    static class PhotoItem{

        String id;
        String base64;

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
