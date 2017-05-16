package com.cashalot.web.rest.controller;

import com.cashalot.services.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

//@RestController //// TODO: 5/16/2017 RestController ?  RedirectAttributes  ?
@Controller
public class FileLoaderController {

    @Autowired
    private StorageService storageService;




    @PostMapping(value = "/upload")
    public @ResponseBody String handleFileUpload(@RequestParam("file") MultipartFile file
                                   /*, RedirectAttributes redirectAttributes*/) {


        storageService.store(file);
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "success";
    }


}
