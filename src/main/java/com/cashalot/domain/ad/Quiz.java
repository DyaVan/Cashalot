package com.cashalot.domain.ad;

import com.cashalot.domain.actors.Advertiser;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String questionText;

    @Column
    private String answerOptions;

    @Column
    private String answer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "advertiserId", referencedColumnName = "id")
    private Advertiser advertiser;


    public String getAnswerOptions(){
        return answerOptions;
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

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }
}
