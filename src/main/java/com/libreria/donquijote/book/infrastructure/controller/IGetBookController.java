package com.libreria.donquijote.book.infrastructure.controller;


import com.libreria.donquijote.book.domain.Book;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/book/")
@Validated
public interface IGetBookController {

    @GetMapping("list")
    List<Book> getBookLst();

    @GetMapping("{id}")
    Book getBookId(Integer id);
}
