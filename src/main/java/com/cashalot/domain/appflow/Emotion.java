package com.cashalot.domain.appflow;


public enum Emotion {

    Emotionless, Happiness, Anger, Surprise, Sadness, Fear;

    public static Emotion getEmotion(Integer code) {
        switch (code) {
            case 0:{
                return Emotionless;
            }
            case 1:{
                return Happiness;
            }
            case 2:{
                return Anger;
            }
            case 3:{
                return Surprise;
            }
            case 4:{
                return Sadness;
            }
            case 5:{
                return Fear;
            }
            default:{
                return Emotionless;
            }
        }
    }




}
