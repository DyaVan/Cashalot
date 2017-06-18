package com.cashalot.web.rest.controller;

import com.cashalot.dto.TestDTO;
import com.cashalot.services.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

//@RestController //// TODO: 5/16/2017 RestController ?  RedirectAttributes  ?
@Controller
public class FileLoaderController {

    @Autowired
    private StorageService storageService;


    @PostMapping(value = "/upload")
    public @ResponseBody String handleFileUpload(@RequestParam("file") MultipartFile file,
                                                 @ModelAttribute(name = "test") TestDTO test,
                                                 BindingResult bindingResult
                                   /*, RedirectAttributes redirectAttributes*/) {

        System.out.println(test.getStr());
        test.getStrings().forEach(s -> System.out.println(s));
        storageService.store(file,"image");
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "success";
    }


}
