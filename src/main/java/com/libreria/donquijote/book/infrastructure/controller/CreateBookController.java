package com.libreria.donquijote.book.infrastructure.controller;

import com.libreria.donquijote.book.application.abm.IBookCreateService;
import com.libreria.donquijote.book.domain.Book;

public class CreateBookController implements ICreateBookController{

    private final IBookCreateService service;

    public CreateBookController(IBookCreateService service) {
        this.service = service;
    }


    @Override
    public Book createBook(Book book) {
        return service.createBook(book);
    }
}
