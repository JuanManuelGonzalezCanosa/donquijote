package com.libreria.donquijote.book.application.create;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.IBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookCreateService implements IBookCreateService {


    private final IBookRepository repository;

    public BookCreateService(@Qualifier("ibookrepository") IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book createBook(Book book) {
        //fue dado.
        return repository.save(book);
    }
}
