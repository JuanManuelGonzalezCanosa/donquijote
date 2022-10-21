package com.libreria.donquijote.book.infrastructure.controller;

import com.libreria.donquijote.book.application.abm.IBookPutService;
import com.libreria.donquijote.book.domain.Book;

public class PutBookController implements IPutController{

    private final IBookPutService service;


    public PutBookController(IBookPutService service) {
        this.service = service;
    }

    @Override
    public Book putBook(Book book, Integer id) {
        return service.putBook(book, id);
    }
}
