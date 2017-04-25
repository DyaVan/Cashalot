package com.cashalot;

import com.cashalot.domain.ad.content.AdContent;
import com.cashalot.domain.ad.content.ImageContent;
import com.cashalot.domain.ad.content.VideoContent;

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

        contents.add(new ImageContent());
        contents.add(new VideoContent());

        contents.forEach(x -> System.out.println(x.getContentType()));
    }
}
