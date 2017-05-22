package com.cashalot.web.ordinary.controller;

import com.cashalot.repository.CategoryRepository;
import com.cashalot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class WelcomeController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping
    public String goHome(Model model) {
        model.addAttribute("category", categoryRepository.findOne(1L));
        return "helloPage";
    }

    @RequestMapping(value = "/myPage")
    public String goMyPage(Model model, Authentication auth) {
        String userEmail = ((Principal)auth.getPrincipal()).getName();
        model.addAttribute("user", userRepository.findByEmail(userEmail));

        return "myPage";
    }


    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showUploadPage() {
        return "uploadPage";
    }


}
