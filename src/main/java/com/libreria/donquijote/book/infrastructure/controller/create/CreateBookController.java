package com.libreria.donquijote.book.infrastructure.controller.create;

import com.libreria.donquijote.book.application.create.IBookCreateService;
import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.BookIsbn;
import com.libreria.donquijote.book.domain.BookNameAuthor;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateBookController implements ICreateBookController {

    private final IBookCreateService service;

    public CreateBookController(IBookCreateService service) {
        this.service = service;
    }


    @Override
    public Book createBook(BookDTO bookDTO) {
        Book book = new Book(new BookIsbn(bookDTO.getId()),
                bookDTO.getNameBook(),
                new BookNameAuthor(bookDTO.getAuthorName(), bookDTO.getAuthorLastName())
                , bookDTO.getStock(), bookDTO.getPrice());
        return service.createBook(book);
    }
}
