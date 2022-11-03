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

    private ApplicationEventPublisher applicationEventPublisher;

    public BookCreateService(@Qualifier("ibookrepository") IBookRepository repository) {
        this.repository = repository;
    }

    public BookCreateService(IBookRepository repository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = repository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public Book createBook(Book book) {
        //fue dado.
        return repository.save(book);
        applicationEventPublisher.publishEvent(new BookAddeDomain());

    }
}
