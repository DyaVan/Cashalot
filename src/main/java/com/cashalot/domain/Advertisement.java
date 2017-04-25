package com.cashalot.domain;

/**
 * Created by VA-N_ on 19.04.2017.
 */
public class Advertisement {

    static long idCount = 1;

    private final long id;
    private Subject subject;
    private AdContent content;
    private AdTest test;

    public Advertisement(Subject subject, AdContent content, AdTest test) {
        this.id = idCount++;
        this.subject = subject;
        this.content = content;
        this.test = test;
    }
}
