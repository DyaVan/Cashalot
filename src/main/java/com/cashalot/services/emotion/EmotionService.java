package com.cashalot.services.emotion;

import com.cashalot.domain.appflow.Emotion;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmotionService {


    Emotion extractEmotion(){
        RestTemplate restTemplate = new RestTemplate();

        EmotionPhotosDTO dto = new EmotionPhotosDTO();
        dto.photos.add(new EmotionPhotosDTO.PhotoItem(1, "lol"));
        dto.photos.add(new EmotionPhotosDTO.PhotoItem(2, ""));

        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        String url = "http://emotion:api@127.0.0.1:5000/api/PostImage";

        String[] quotes = new String[]{"lol", "kek"};

        restTemplate.postForObject(url, quotes, EmotionsDTO.class, "parameter");


        return null;
    }


    public static void main(String[] args) {



        EmotionsDTO emotionsDTO1 = new EmotionsDTO();
        emotionsDTO1.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO1.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO1.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));

        EmotionsDTO emotionsDTO2 = new EmotionsDTO();
        emotionsDTO2.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO2.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO2.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));

        EmotionsDTO emotionsDTO3 = new EmotionsDTO();
        emotionsDTO3.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO3.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));
        emotionsDTO3.emotions.add(new EmotionsDTO.EmotionItem(10, 20, 25, 15, 0));

        List<EmotionsDTO> list = new ArrayList<>();
        list.add(emotionsDTO1);
        list.add(emotionsDTO2);
        list.add(emotionsDTO3);


        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper1 = Jackson2ObjectMapperBuilder.json().build();

        String json = "";

        try {
            json = mapper.writeValueAsString(list);
            System.out.println(json);


            CollectionType javaType = mapper.getTypeFactory()
                    .constructCollectionType(List.class, EmotionsDTO.class);

            List<EmotionsDTO> asList = mapper.readValue(json, javaType);

            System.out.println(asList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }




}

