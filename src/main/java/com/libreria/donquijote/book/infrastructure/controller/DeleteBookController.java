package com.libreria.donquijote.book.infrastructure.controller;

import com.libreria.donquijote.book.application.abm.IBookDeleteService;

public class DeleteBookController implements IDeleteBookController{

    private final IBookDeleteService service;

    public DeleteBookController(IBookDeleteService service) {
        this.service = service;
    }

    @Override
    public boolean deleteBook(Integer id) {
        service.deleteBook(id);
        return true;
    }
}
