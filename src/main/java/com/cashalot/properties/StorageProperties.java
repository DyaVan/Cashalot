package com.cashalot.properties;

//import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

@Component
public class StorageProperties {

    /**
     * Folder location for storing files
     */
//    private String imagesLocation = "D:\\Ivan_Diachuk\\Cashalot\\media";
//    private String videoLocation = "D:\\Ivan_Diachuk\\Cashalot\\media";
//    private String shitLocation = "D:\\Shit";
    private String imagesLocation = "D:\\DiplomPROTASHCHEN\\Cashalot\\src\\main\\webapp\\media";
    private String videoLocation = "D:\\DiplomPROTASHCHEN\\Cashalot\\src\\main\\webapp\\media";
    private String shitLocation = "D:\\DiplomPROTASHCHEN\\Cashalot\\src\\main\\webapp\\media";

    public String getLocation(String contentType) {
        return contentType.equals("image") ?
                imagesLocation : contentType.equals("video") ? videoLocation : shitLocation;
    }

}
