package com.cashalot.domain.appflow;


public enum Emotion {

    Emotionless(0), Happiness(1), Anger(2), Surprise(3), Sadness(4), Fear(5);

    int code;

    public int getCode() {
        return code;
    }



    Emotion(int code) {
        this.code=code;
    }

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
