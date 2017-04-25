package com.cashalot.services;


import com.cashalot.domain.AdContent;
import com.cashalot.domain.AdTest;
import com.cashalot.domain.Advertisement;
import com.cashalot.domain.Subject;
import org.junit.Assert;
import org.mockito.Mockito;

public class AdService {

    public Advertisement createAdvertisement(Subject subject, AdContent content, AdTest test) {
        return new Advertisement(subject, content, test);
    }


}
