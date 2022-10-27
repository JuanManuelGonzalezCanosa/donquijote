package com.libreria.donquijote.book.infrastructure.controller.get;

import com.libreria.donquijote.book.application.get.IBookGetService;
import com.libreria.donquijote.book.domain.Book;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetBookController implements IGetBookController {

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
