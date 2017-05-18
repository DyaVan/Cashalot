package com.cashalot.web.ordinary.controller;

import com.cashalot.domain.actors.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorizationController  {


//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String showLoginPage(){
//        return "loginPage";
//    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String showRegisterPage(){
        return "registerPage";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String register(){

    }


}
