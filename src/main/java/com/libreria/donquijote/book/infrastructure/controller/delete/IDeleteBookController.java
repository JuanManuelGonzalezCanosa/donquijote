package com.libreria.donquijote.book.infrastructure.controller.delete;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/book/")
@Validated
public interface IDeleteBookController {

    @DeleteMapping("delete/{id}")
    boolean deleteBook(@PathVariable Integer id);
}
