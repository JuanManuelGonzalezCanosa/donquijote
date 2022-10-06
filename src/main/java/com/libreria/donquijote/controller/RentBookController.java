package com.libreria.donquijote.controller;


import com.libreria.donquijote.service.RentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book/rent/")
public class RentBookController {

    @Autowired
    private RentBookService service;

    private RestTemplate restTemplate;

    @Autowired
    public RentBookController(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
}
