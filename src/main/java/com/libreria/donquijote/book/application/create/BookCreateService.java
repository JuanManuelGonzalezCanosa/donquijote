package com.libreria.donquijote.book.application.create;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.BookAddeDomain;
import com.libreria.donquijote.book.domain.IBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class BookCreateService implements IBookCreateService {


    private final IBookRepository repository;

    private final ApplicationEventPublisher applicationEventPublisher;


    public BookCreateService(@Qualifier("ibookrepository") IBookRepository repository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = repository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public Book createBook(Book book) {
        //fue dado.

        String id = book.getBookIsbn().getId();
        String nameBook = book.getNameBook().getNameBook();
        String nameAuthor = book.getBookNameAuthor().getFirstName() +" "+ book.getBookNameAuthor().getLastName();
        int stock = book.getStock().getStock();
        Double price = book.getPrice().getPrice();


        applicationEventPublisher.publishEvent(new BookAddeDomain(id, nameBook, nameAuthor, stock, price));

        return repository.save(book);

    }
}
