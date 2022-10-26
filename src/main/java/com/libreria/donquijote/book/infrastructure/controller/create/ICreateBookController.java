package com.libreria.donquijote.book.infrastructure.controller.create;


import com.libreria.donquijote.book.domain.Book;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/book/")
@Validated
public interface ICreateBookController {

    @PostMapping("create")
    Book createBook(@RequestBody BookDTO bookDTO);
}
