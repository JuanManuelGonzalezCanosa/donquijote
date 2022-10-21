package com.libreria.donquijote.book.application.abm;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.IBookRepository;

public class BookCreateService implements IBookCreateService{

    private IBookRepository repository;

    public BookCreateService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }
}
