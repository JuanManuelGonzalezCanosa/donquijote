package com.libreria.donquijote.book.infrastructure.controller;

import com.libreria.donquijote.book.application.abm.IBookGetService;
import com.libreria.donquijote.book.domain.Book;

import java.util.List;

public class GetBookController implements IGetBookController{

    private final IBookGetService service;

    public GetBookController(IBookGetService service) {
        this.service = service;
    }

    @Override
    public List<Book> getBookLst() {
        return service.getBookLst();
    }

    @Override
    public Book getBookId(Integer id) {
        return service.getBookId(id);
    }
}
