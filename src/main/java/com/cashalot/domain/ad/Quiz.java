package com.cashalot.domain.ad;

import com.cashalot.domain.actors.Advertiser;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    private long id;

    @Column
    private String questionText;

    @Column
    private String answerOptions;

    @Column
    private String answer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertiserId", nullable = false)
    private Advertiser advertiser;


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
