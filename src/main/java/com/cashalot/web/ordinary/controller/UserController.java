package com.cashalot.web.ordinary.controller;

import com.cashalot.domain.actors.User;
import com.cashalot.dto.UserRegistrationDTO;
import com.cashalot.services.UserService;
import com.cashalot.validation.annotations.UniqueEmail;
import com.cashalot.validation.annotations.ValidEmail;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showUserRegistrationForm(@ModelAttribute(name = "user") UserRegistrationDTO userDTO) {
        return "public/userRegistration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute(name = "user") @Valid UserRegistrationDTO userDTO,
                                       BindingResult bindingResult) {
        if (bindingResult.hasErrors() ) {
            return "public/userRegistration";
        }

        userService.register(
                userDTO.getEmail(),
                userDTO.getName(),
                userDTO.getSex(),
                userDTO.getAge(),
                userDTO.getPassword());

        return "redirect:public/home";
    }

}

