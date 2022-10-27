package com.libreria.donquijote.book.infrastructure.controller.delete;

import com.libreria.donquijote.book.application.delete.IBookDeleteService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteBookController implements IDeleteBookController {

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
