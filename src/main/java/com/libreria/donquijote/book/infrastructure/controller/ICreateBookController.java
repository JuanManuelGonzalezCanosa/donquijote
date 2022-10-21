package com.libreria.donquijote.book.infrastructure.controller;


import com.libreria.donquijote.book.domain.Book;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/book/")
@Validated
public interface ICreateBookController {

    @PostMapping("create")
    Book createBook(Book book);
}
