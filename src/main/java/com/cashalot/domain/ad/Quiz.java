package com.cashalot.domain.ad;

import java.util.List;

public class Quiz {


    private String quizType;
    private String questionText;
    private String answerOptions;
    private String answer;

    public String getType(){
        return quizType;
    }

    public List<String> getAnswerOptions(){
        throw new UnsupportedOperationException();
    }

    public String getAnswer(){
        return answer;
    }

    public String getQuestionText(){
        return questionText;
    }



}
