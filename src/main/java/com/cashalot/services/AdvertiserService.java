package com.cashalot.services;

import com.cashalot.domain.actors.Advertiser;
import com.cashalot.domain.actors.AuthorizationDetails;
import com.cashalot.domain.ad.AdContent;
import com.cashalot.domain.ad.Quiz;
import com.cashalot.domain.appflow.Order;
import com.cashalot.domain.appflow.TagBinding;
import com.cashalot.domain.subject.Category;
import com.cashalot.domain.subject.Subject;
import com.cashalot.domain.subject.Tag;
import com.cashalot.repository.*;
import com.cashalot.services.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AdvertiserService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthorizationDetailsRepository authorizationDetailsRepository;

    @Autowired
    AdvertiserRepository advertiserRepository;


    public void register(String name,
                         String emailLogin,
                         String password,
                         String emailContact,
                         String webLink,
                         String telephone,
                         String additionalInfo,
                         boolean notACompany) {

        Advertiser newAdvertiser = new Advertiser();
        newAdvertiser.setName(name);
        newAdvertiser.setEmailLogin(emailLogin);
        newAdvertiser.setEmailContact(emailContact);
        newAdvertiser.setWebLink(webLink);
        newAdvertiser.setTelephone(telephone);
        newAdvertiser.setAdditionalInfo(additionalInfo);
        newAdvertiser.setNotACompany(notACompany);

        AuthorizationDetails authDetails = new AuthorizationDetails();
        authDetails.setPassword(passwordEncoder.encode(password));
        authDetails.setEmail(emailLogin);
        authDetails.setRole(roleRepository.findOne(2L));//// TODO: 12.06.2017 GAVNOKOD
        authDetails.setEnabled(true);

        authorizationDetailsRepository.save(authDetails);
        advertiserRepository.save(newAdvertiser);
    }

    @Autowired
    TagRepository tagRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    TagBindingRepository tagBindingRepository;

    public void createSubject(String name,
                                 Long categoryId,
                                 String webLink,
                                 String productInfo,
                                 List<String> tags,
                                 String advertiserLoginEmail) {

        Advertiser advertiser = advertiserRepository.findByEmailLogin(advertiserLoginEmail);
        Category category = categoryRepository.findOne(categoryId);

        tags.forEach(s -> {
            if (tagRepository.findByName(s) == null) {
                tagRepository.save(new Tag(s));
            }
        });

        List<Long> tagIds = new ArrayList<>();

        tags.forEach(s -> {
            Tag tag = tagRepository.findByName(s);
            if (tag != null) {
                tagIds.add(tag.getId());
            }
        });

        Subject newSubject = new Subject();
        newSubject.setName(name);
        newSubject.setWebLink(webLink);
        newSubject.setAdvertiser(advertiser);
        newSubject.setCategory(category);
        newSubject.setProductInfo(productInfo);

        Subject finalNewSubject = subjectRepository.save(newSubject);

        tagIds.forEach(tagId -> {
            TagBinding tagBinding = new TagBinding();
            tagBinding.setSubjectId(finalNewSubject.getId());
            tagBinding.setTagId(tagId);
            tagBindingRepository.save(tagBinding);
        });


    }

    @Autowired
    QuizRepository quizRepository;

    public void createQuiz(String questionText, List<String> answerOptions, String answer, String advertiserLoginEmail) {
        Optional<String> singleAnswerOptions = answerOptions.stream().reduce((s, s2) -> s+"|&|" + s2);

        Quiz newQuiz = new Quiz();
        newQuiz.setQuestionText(questionText);
        newQuiz.setAnswerOptions(singleAnswerOptions.orElse("Ok"));
        newQuiz.setAnswer(answer);
        newQuiz.setAdvertiser(advertiserRepository.findByEmailLogin(advertiserLoginEmail));

        quizRepository.save(newQuiz);
    }

    @Autowired
    AdContentRepository adContentRepository;


    @Autowired
    private StorageService storageService;


    public void createContent(String topic, String contentType, String beforeText, String afterText, Advertiser advertiser, MultipartFile mediaFile) {

        AdContent newAdContent = new AdContent();
        newAdContent.setTopic(topic);
        newAdContent.setBeforeText(beforeText);
        newAdContent.setAfterText(afterText);
        newAdContent.setContentType(contentType);
        newAdContent.setAdvertiser(advertiser);

        AdContent adContent = adContentRepository.saveAndFlush(newAdContent);
        storageService.store(mediaFile,contentType,adContent.getId());
    }

    @Autowired
    AdContentRepository contentRepository;

    @Autowired
    OrderRepository orderRepository;

    public void createOrder(String advertiserEmail,
                            Long contentId,
                            Long quizId,
                            Long subjectId,
                            int cost,
                            int totalViews,
                            int viewsPerUser,
                            Date endDate,
                            Date startDate,
                            boolean ageLimited, byte maxAge, byte minAge, boolean sexLimited, boolean sex) {

        Order newOrder = new Order();
        newOrder.setAdvertiser(advertiserRepository.findByEmailLogin(advertiserEmail));
        newOrder.setContent(contentRepository.findOne(contentId));
        newOrder.setQuiz(quizRepository.findOne(quizId));
        newOrder.setSubject(subjectRepository.findOne(subjectId));
        newOrder.setCost(cost);
        newOrder.setTotalViews(totalViews);
        newOrder.setViewsPerUser(viewsPerUser);
        newOrder.setEndDate(endDate);
        newOrder.setStartDate(startDate);
        newOrder.setAgeLimited(ageLimited);
        newOrder.setMaxAge(maxAge);
        newOrder.setMinAge(minAge);
        newOrder.setSexLimited(sexLimited);
        newOrder.setSex(sex);
        newOrder.setStatus(Order.PROCESSING_STATUS);
        newOrder.setOrderDate(new Date());

        orderRepository.save(newOrder);
    }
}
