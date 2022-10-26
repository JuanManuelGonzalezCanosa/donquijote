package com.libreria.donquijote.book.application.abm;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.IBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookCreateService implements IBookCreateService{

    @Qualifier("ibookrepository")
    private final IBookRepository repository;

    public BookCreateService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }
}
