package com.libreria.donquijote.book.application.abm;

import com.libreria.donquijote.book.domain.BookException;
import com.libreria.donquijote.book.domain.IBookRepository;

public class BookDeleteService implements IBookDeleteService{

    private IBookRepository repository;

    public BookDeleteService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean deleteBook(Integer id) {
        if(!repository.findById(id).isPresent()){
            throw new BookException("el libro no EXISTE");
        }
        repository.deleteById(id);
        return true;
    }
}
