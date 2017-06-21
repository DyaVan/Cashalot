package com.cashalot.services.emotion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties
public class EmotionsDTO implements Serializable {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmotionsDTO{");
        sb.append("emotions=").append(emotions);
        sb.append('}');
        return sb.toString();
    }

    public EmotionsDTO() {
    }

    public EmotionsDTO(List<EmotionItem> emotions) {
        this.emotions = emotions;
    }

    List<EmotionItem> emotions = new ArrayList<>();

    public List<EmotionItem> getEmotions() {
        return emotions;
    }

    public void setEmotions(List<EmotionItem> emotions) {
        this.emotions = emotions;
    }

    @JsonIgnoreProperties
    static class EmotionItem {
        public EmotionItem() {
        }

        public EmotionItem(Coordinates coordinates, Integer emotion_code) {
            this.coordinates = coordinates;
            this.emotion_code = emotion_code;
        }

        public EmotionItem(int h, int w, int x, int y, Integer emotion_code) {
            this.coordinates = new Coordinates(h,w,x,y);
            this.emotion_code = emotion_code;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Integer getEmotion_code() {
            return emotion_code;
        }

        public void setEmotion_code(Integer emotion_code) {
            this.emotion_code = emotion_code;
        }

        @JsonIgnoreProperties
        class Coordinates{
            public Coordinates() {
            }

            public int getH() {
                return h;
            }

            public void setH(int h) {
                this.h = h;
            }

            public int getW() {
                return w;
            }

            public void setW(int w) {
                this.w = w;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public Coordinates(int h, int w, int x, int y) {
                this.h = h;
                this.w = w;

                this.x = x;
                this.y = y;
            }

            int h;
            int w;
            int x;
            int y;
        }

        Coordinates coordinates;
        Integer emotion_code;

    }

}
