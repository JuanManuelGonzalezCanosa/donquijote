package com.libreria.donquijote.controller;


import com.libreria.donquijote.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController("bookcontroller")
public class BookController {

    @Autowired
    @Qualifier("bookservice")
    private IBookService service;


}
