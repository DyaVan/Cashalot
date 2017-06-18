package com.cashalot.dto;

import com.cashalot.validation.annotations.RightAmount;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class QuizDTO {

    @NotEmpty
    @Size(min = 3, max = 50)
    private String questionText;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String answer;

    @RightAmount
    List<String> answerOptions = new ArrayList<>();

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answerOptions = answerOptions;
    }
}
