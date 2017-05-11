package com.cashalot.domain.ad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    private long id;

    @Column
    private String quizType;

    @Column
    private String questionText;

    @Column
    private String answerOptions;

    @Column
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

    protected void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswerOptions(String answerOptions) {
        this.answerOptions = answerOptions;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
