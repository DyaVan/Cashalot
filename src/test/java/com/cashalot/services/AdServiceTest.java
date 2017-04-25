package com.cashalot.services;

import com.cashalot.domain.AdContent;
import com.cashalot.domain.AdTest;
import com.cashalot.domain.Advertisement;
import com.cashalot.domain.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class AdServiceTest {

    @Before
    public void initTest() {
        service = new AdService();
    }

    AdService service;

    @Test
    public void createAdvertisement() throws Exception {
        AdContent content = Mockito.mock(AdContent.class);
        AdTest test = Mockito.mock(AdTest.class);
        Subject subject = Mockito.mock(Subject.class);

        Advertisement ad = service.createAdvertisement(subject, content, test);

        Assert.assertNotNull(ad);
    }

}