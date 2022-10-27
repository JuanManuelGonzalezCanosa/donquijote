package com.libreria.donquijote.book.infrastructure.controller.put;


import com.libreria.donquijote.book.domain.Book;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/book/")
@Validated
public interface IPutController {

    @PutMapping("put/{id}")
    Book putBook(@RequestBody Book book, @PathVariable Integer id);
}
