package com.libreria.donquijote.book.infrastructure.controller;


import com.libreria.donquijote.book.domain.Book;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/book/")
@Validated
public interface IPutController {

    @PutMapping("put/{id}")
    Book putBook(Book book, Integer id);
}
