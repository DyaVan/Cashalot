package com.cashalot.web.ordinary.controller;

import com.cashalot.domain.actors.Advertiser;
import com.cashalot.domain.subject.Subject;
import com.cashalot.dto.*;
import com.cashalot.repository.AdvertiserRepository;
import com.cashalot.repository.CategoryRepository;
import com.cashalot.services.AdvertiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FilenameUtils;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/advertiser")
public class AdvertiserController {

    @Autowired
    AdvertiserService advertiserService;

    @RequestMapping(value = "/")
    public String cabinet() {
        return "advertiser/companyStatus";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(@ModelAttribute(name = "advertiser") AdvertiserRegistrationDTO advertiserRegistrationDTO) {
        return "public/companyRegistration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerAdvertiser(@ModelAttribute(name = "advertiser") @Valid AdvertiserRegistrationDTO advertiserRegistrationDTO,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "public/companyRegistration";
        }

        advertiserService.register(advertiserRegistrationDTO.getName(),
                advertiserRegistrationDTO.getEmailLogin(),
                advertiserRegistrationDTO.getPassword(),
                advertiserRegistrationDTO.getEmailContact(),
                advertiserRegistrationDTO.getWebLink(),
                advertiserRegistrationDTO.getTelephone(),
                advertiserRegistrationDTO.getAdditionalInfo(),
                advertiserRegistrationDTO.getNotACompany());

        return "redirect:/cashalot/";
    }

    //---------------------createSubject---------------------------------------

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(value = "/createSubject", method = RequestMethod.GET)
    public String showCreateSubjectPage(@ModelAttribute(name = "subject") SubjectDTO subjectDTO,
                                        Model model) {

        model.addAttribute("categories",categoryRepository.findAll());


        return "advertiser/createSubject";
    }

    @RequestMapping(value = "/createSubject", method = RequestMethod.POST)
    public String createSubject(@ModelAttribute(name = "subject") @Valid SubjectDTO subjectDTO,
                                Principal principal,
                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "advertiser/createSubject";
        }

        String advertiserLoginEmail = principal.getName();

        advertiserService.createSubject(subjectDTO.getName(),
                subjectDTO.getCategoryId(),
                subjectDTO.getWebLink(),
                subjectDTO.getProductInfo(),
                subjectDTO.getTags(),
                advertiserLoginEmail);

        return "redirect:/cashalot/advertiser/newOrder";
    }

    //---------------------createQuiz---------------------------------------

    @RequestMapping(value = "/createQuiz", method = RequestMethod.GET)
    public String showCreateQuizPage(@ModelAttribute(name = "quiz") QuizDTO quizDTO) {
        return "advertiser/createQuiz";
    }

    @RequestMapping(value = "/createQuiz", method = RequestMethod.POST)
    public String createQuiz(@ModelAttribute(name = "quiz") @Valid QuizDTO quizDTO,
                             Principal principal,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "advertiser/createQuiz";
        }

        String advertiserLoginEmail = principal.getName();

        advertiserService.createQuiz(quizDTO.getQuestionText(),
                quizDTO.getAnswerOptions(),
                quizDTO.getAnswer(),
                advertiserLoginEmail);

        return "redirect:/cashalot/advertiser/newOrder";
    }

    //---------------------createContent---------------------------------------

    @RequestMapping(value = "/createContent", method = RequestMethod.GET)
    public String showCreateContentPage(@ModelAttribute(name = "content") ContentDTO contentDTO) {
        return "advertiser/createContent";
    }

    @RequestMapping(value = "/createContent", method = RequestMethod.POST)
    public String createQuiz(Principal principal,
                             @ModelAttribute(name = "content") @Valid ContentDTO contentDTO,
                             BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "advertiser/createContent";
        }

        String advertiserLoginEmail = principal.getName();
        Advertiser advertiser = advertiserRepository.findByEmailLogin(advertiserLoginEmail);

        advertiserService.createContent(contentDTO.getTopic(),
                contentDTO.getContentType(),
                contentDTO.getBeforeText(),
                contentDTO.getAfterText(),
                advertiser, contentDTO.getMediaFile());

        return "redirect:/cashalot/advertiser/newOrder";
    }

    //---------------------newOrder---------------------------------------

    @Autowired
    AdvertiserRepository advertiserRepository;

    @RequestMapping(value = "/newOrder", method = RequestMethod.GET)
    public String showNewOrderPage(Model model,
            @ModelAttribute(name = "order") OrderDTO orderDTO,
                                   Principal principal) {

        model.addAttribute("advertiser", advertiserRepository.findByEmailLogin(principal.getName()));


        return "advertiser/newOrder";
    }

    @RequestMapping(value = "/newOrder", method = RequestMethod.POST)
    public String createNewOrder(@ModelAttribute(name = "order") @Valid OrderDTO orderDTO,
                                 Principal principal, Model model) {

        System.out.println(orderDTO);
        System.out.println(principal.getName());

        advertiserService.createOrder(principal.getName(),orderDTO.getContentId(),
                orderDTO.getQuizId(),
                orderDTO.getSubjectId(),
                orderDTO.getCost(),
                orderDTO.getTotalViews(),
                orderDTO.getViewsPerUser(),
                orderDTO.getEndDate(),
                orderDTO.getStartDate(),
                orderDTO.isAgeLimited(),
                orderDTO.getMaxAge(),
                orderDTO.getMinAge(),
                orderDTO.isSexLimited(),
                orderDTO.isSex());

        return "advertiser/newOrder";
    }


}
