package com.cashalot.services;

import com.cashalot.domain.ad.content.AdContent;
import com.cashalot.domain.ad.quiz.Quiz;
import com.cashalot.domain.ad.Advertisement;
import com.cashalot.domain.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class AdServiceTest {

    @Before
    public void initTest() {
        service = new AdService();
    }

    AdService service;

    @Test
    public void createAdvertisement() throws Exception {
        AdContent content = Mockito.mock(AdContent.class);
        Quiz test = Mockito.mock(Quiz.class);
        Subject subject = Mockito.mock(Subject.class);

        Advertisement ad = service.createAdvertisement(subject, content, test);

        Assert.assertNotNull(ad);
    }

}