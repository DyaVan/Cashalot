package com.cashalot.web.rest.controller;

import com.cashalot.dto.TestDTO;
import com.cashalot.services.storage.StorageService;
import com.cashalot.validation.annotations.ValidMediaFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

//@RestController //// TODO: 5/16/2017 RestController ?  RedirectAttributes  ?
@Controller
public class FileLoaderController {

    @Autowired
    private StorageService storageService;


    @PostMapping(value = "/upload")
    public @ResponseBody String handleFileUpload(@ModelAttribute(name = "test") @Valid TestDTO test,
                                                 BindingResult bindingResult
                                   /*, RedirectAttributes redirectAttributes*/) {

        if (bindingResult.hasErrors()) {
            return bindingResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage()).reduce((s, s2) -> s + "<br>" + s2).orElse("");
        }

        System.out.println(test.getStr());
        System.out.println(test.getStartDate());
        test.getStrings().forEach(s -> System.out.println(s));
        storageService.store(test.getFile(),"image",0L);
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "success";
    }


}
