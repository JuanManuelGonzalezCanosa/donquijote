package com.libreria.donquijote.controller;


import com.libreria.donquijote.service.RentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/rent/")
public class RentBookController {

    @Autowired
    private RentBookService service;
}
