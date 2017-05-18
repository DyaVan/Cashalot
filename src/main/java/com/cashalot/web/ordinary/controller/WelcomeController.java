package com.cashalot.web.ordinary.controller;

import com.cashalot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {

    @Autowired
    private CategoryRepository categoryRepository;


    @RequestMapping
    public String goHome(Model model) {
        System.out.println("sdsd");
        model.addAttribute("category", categoryRepository.findOne(1L));
        return "helloPage";
    }




    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showUploadPage() {
        return "uploadPage";
    }


}
