package com.cashalot.domain.ad;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Quiz {

    @Id
    private long id;
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
