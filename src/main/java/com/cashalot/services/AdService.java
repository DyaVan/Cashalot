package com.cashalot.services;


import com.cashalot.domain.ad.content.AdContent;
import com.cashalot.domain.ad.quiz.Quiz;
import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.Subject;

public class AdService {

    public Advertisement createAdvertisement(Subject subject, AdContent content, Quiz test) {
        return new Advertisement(subject, content, test);
    }

//    public Quiz createAdTest() {
//        return
//    }


}
