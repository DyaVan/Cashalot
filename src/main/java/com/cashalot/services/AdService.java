package com.cashalot.services;


import com.cashalot.domain.ad.AdContent;
import com.cashalot.domain.ad.Quiz;
import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.subject.Subject;

public class AdService {

    public Advertisement createAdvertisement(Subject subject, AdContent content, Quiz test, int cost) {
        return new Advertisement(subject, content, test, cost);
    }


//    public Pack preparePackForUser(User user){
//
//    }

}
