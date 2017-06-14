package com.cashalot.web.ordinary.controller;

import com.cashalot.repository.CategoryRepository;
import com.cashalot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class WelcomeController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/page/{dir}/{pageName}")
    public String goHome(@PathVariable String dir,@PathVariable String pageName) {
        return dir+"/"+pageName;
    }

    @RequestMapping
    public String goHome(Model model) {
        model.addAttribute("category", categoryRepository.findOne(1L));
        return "helloPage";
    }

    @RequestMapping(value = "/myPage")
    @Transactional
    public String goMyPage(Model model, Authentication auth) {
        String userEmail = ((User)auth.getPrincipal()).getUsername();
        model.addAttribute("user", userRepository.findByEmail(userEmail));

        return "myPage";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showUploadPage(HttpServletRequest req) {
        return "uploadPage";
    }


}
