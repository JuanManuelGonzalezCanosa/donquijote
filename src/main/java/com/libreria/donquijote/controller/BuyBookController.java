package com.libreria.donquijote.controller;


import com.libreria.donquijote.service.BuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/buy/")
public class BuyBookController {

    @Autowired
    private BuyBookService service;


}
