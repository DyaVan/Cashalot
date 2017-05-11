package com.cashalot.web.ordinary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Cashalot")
public class WelcomeController {

    @RequestMapping
    public String goHome() {
        return "helloPage";
    }

}
