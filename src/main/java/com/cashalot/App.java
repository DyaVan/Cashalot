package com.cashalot;

import com.cashalot.domain.ad.AdContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<AdContent> contents = new ArrayList<AdContent>();



        contents.forEach(x -> System.out.println(x.getContentType()));



    }
}
