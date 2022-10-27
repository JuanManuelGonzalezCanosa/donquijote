package com.libreria.donquijote.book.application.delete;

import com.libreria.donquijote.book.domain.exception.BookException;
import com.libreria.donquijote.book.domain.IBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookDeleteService implements IBookDeleteService {

    private IBookRepository repository;

    public BookDeleteService(@Qualifier("ibookrepository") IBookRepository repository) {
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
