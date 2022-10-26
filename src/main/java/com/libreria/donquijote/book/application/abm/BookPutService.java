package com.libreria.donquijote.book.application.abm;

import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.domain.BookException;
import com.libreria.donquijote.book.domain.IBookRepository;

public class BookPutService implements IBookPutService{

    private final IBookRepository repository;

    public BookPutService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book putBook(Book book, Integer id) {
        if(!repository.findById(id).isPresent()){
                throw new BookException("el libro no EXISTE");
        }

        Book aux = repository.findById(id).get();

        aux.setNameBook(book.getNameBook());
       // aux.setBookNameAuthor(new BookNameAuthor(book.getNameBook(),book.);
        aux.setPrice(book.getPrice());
        aux.setStock(book.getStock());

        return repository.save(aux);
    }
}
