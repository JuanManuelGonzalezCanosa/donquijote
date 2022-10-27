package com.libreria.donquijote.book.infrastructure.controller.create;

import com.libreria.donquijote.book.application.create.IBookCreateService;
import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.isbn.BookIsbn;
import com.libreria.donquijote.book.domain.nameauthor.BookNameAuthor;
import com.libreria.donquijote.book.domain.namebook.BookNameBook;
import com.libreria.donquijote.book.domain.price.BookPrice;
import com.libreria.donquijote.book.domain.stock.BookStock;
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
                            new BookNameBook(bookDTO.getNameBook()),
                            new BookNameAuthor(bookDTO.getAuthorName(), bookDTO.getAuthorLastName()),
                            new BookStock(bookDTO.getStock()),
                            new BookPrice(bookDTO.getPrice()));

        return service.createBook(book);
    }
}
