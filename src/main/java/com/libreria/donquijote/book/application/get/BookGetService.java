package com.libreria.donquijote.book.application.get;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.exception.BookIsEmpety;
import com.libreria.donquijote.book.domain.exception.BookNotFoundException;
import com.libreria.donquijote.book.domain.IBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;

public class BookGetService implements IBookGetService {

    private final IBookRepository repository;

    public BookGetService(@Qualifier("ibookrepository") IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book getBookId(Integer id) {
        Optional<Book> optionalBook = repository.findById(id);
        if (!optionalBook.isPresent()) throw new BookNotFoundException("Error el libro NO existe");
        return optionalBook.get();
    }

    @Override
    public List<Book> getBookLst() {
        List<Book> optionalBook= repository.findAll();
        if(optionalBook.isEmpty()) throw new BookIsEmpety("Lista de libros VACIA");
        return optionalBook;
    }


}
