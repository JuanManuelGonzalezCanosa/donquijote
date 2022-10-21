package com.libreria.donquijote.book.infrastructure.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/book/")
@Validated
public interface IDeleteBookController {

    @DeleteMapping("delete/{id}")
    boolean deleteBook(Integer id);
}
