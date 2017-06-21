package com.cashalot.web.ordinary.controller;

import com.cashalot.dto.watching.AnswerDTO;
import com.cashalot.repository.UserRepository;
import com.cashalot.services.emotion.EmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/user/watch/")
public class WatchingRoomController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public String showWatchingRoom(@ModelAttribute(name = "answerDTO") AnswerDTO answerDTO,
                                   Model model,
                                   Principal principal){

        return "user/watchingRoom2";
    }

    @Autowired
    EmotionService emotionService;

    @RequestMapping(value = "/answer",method = RequestMethod.POST)
    public String answerQuestion(@ModelAttribute(name = "answerDTO") @Valid AnswerDTO answerDTO,
                                 Principal principal){

        emotionService.extractEmotion(answerDTO.getPhoto1(),
                answerDTO.getPhoto2(),
                answerDTO.getPhoto3(),
                answerDTO.getPhoto4(),
                answerDTO.getPhoto5());

        return "redirect:/cashalot/user/watch/room";
    }


}
