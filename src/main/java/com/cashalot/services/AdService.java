package com.cashalot.services;


import com.cashalot.domain.ad.AdContent;
import com.cashalot.domain.ad.Quiz;
import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.appflow.Order;
import com.cashalot.domain.subject.Subject;
import com.cashalot.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdService {

    @Autowired
    AdvertisementRepository advertisementRepository;

    public void createAdvertisement(Order order) {
        Advertisement newAdd = new Advertisement();
        newAdd.setSexLimited(order.isSexLimited());
        newAdd.setSex(order.isSex());
        newAdd.setAgeLimited(order.isAgeLimited());
        newAdd.setMinAge(order.getMinAge());
        newAdd.setMaxAge(order.getMaxAge());
        newAdd.setStartDate(order.getStartDate());
        newAdd.setEndDate(order.getEndDate());
        newAdd.setCost(order.getCost());
        newAdd.setContent(order.getContent());
        newAdd.setQuiz(order.getQuiz());
        newAdd.setSubject(order.getSubject());
        newAdd.setPrepaidViews(order.getTotalViews());
        newAdd.setViewsPerUser(order.getViewsPerUser());
        newAdd.setSent(0);
        newAdd.setApprovedViews(0);

        advertisementRepository.save(newAdd);
    }

//
//public Advertisement createAdvertisement(Subject subject, AdContent content, Quiz test, int cost) {
//        return new Advertisement(subject, content, test, cost);
//    }

//    public Pack preparePackForUser(User user){
//
//    }

}
