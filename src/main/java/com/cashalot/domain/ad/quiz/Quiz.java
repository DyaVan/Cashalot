package com.cashalot.domain.ad.quiz;

/**
 * Created by VA-N_ on 19.04.2017.
 */
public interface Quiz {

    String getType();

    Iterable<String> getAnswerOptions();

    String getAnswer();


}
