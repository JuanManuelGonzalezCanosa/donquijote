package com.libreria.donquijote.book.infrastructure.controller.put;

import com.libreria.donquijote.book.application.put.IBookPutService;
import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.infrastructure.controller.put.IPutController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutBookController implements IPutController {

    private final IBookPutService service;


    public PutBookController(IBookPutService service) {
        this.service = service;
    }

    @Override
    public Book putBook(Book book, Integer id) {
        return service.putBook(book, id);
    }
}
