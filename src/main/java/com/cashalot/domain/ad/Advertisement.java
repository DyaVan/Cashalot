package com.cashalot.domain.ad;

import com.cashalot.domain.Subject;
import com.cashalot.domain.ad.content.AdContent;
import com.cashalot.domain.ad.quiz.Quiz;


public class Advertisement {

    static long idCount = 1;

    private final long id;
    private Subject subject;
    private AdContent content;
    private Quiz quiz;

    public Advertisement(Subject subject, AdContent content, Quiz quiz) {
        this.id = idCount++;
        this.subject = subject;
        this.content = content;
        this.quiz = quiz;
    }
}
