package com.cashalot.web.ordinary.controllers;

import com.cashalot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Cashalot")
public class WelcomeController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping
    public String goHome(Model model) {

        model.addAttribute("category", categoryRepository.findOne(1L));
        return "helloPage";
    }

}
