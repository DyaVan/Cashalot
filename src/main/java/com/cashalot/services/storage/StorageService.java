package com.cashalot.services.storage;

import com.cashalot.properties.StorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class StorageService {

    private final Path rootVideoLocation ;
    private final Path rootImageLocation ;
    private final Path rootShitLocation ;

    @Autowired
    public StorageService(StorageProperties properties) {
        this.rootImageLocation = Paths.get(properties.getLocation("image"));
        this.rootVideoLocation = Paths.get(properties.getLocation("video"));
        this.rootShitLocation = Paths.get(properties.getLocation(""));
    }

    private Path getRootPath(String contentType) {
        return contentType.equals("image") ?
                rootImageLocation : rootVideoLocation;
    }


    public void store(MultipartFile file,String contentType) {
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
            }
            Files.copy(file.getInputStream(), this.getRootPath(contentType).resolve(file.getOriginalFilename()));
        } catch (IOException e) {
            throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
        }

    }

}
