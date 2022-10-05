package com.libreria.donquijote.service;


import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("bookservice")
@Service
public class BookService{

    @Autowired
    private IBookRepository repository;


    public Book createBook(Book book) {
        return repository.save(book);
    }


    public boolean deleteBookId(Integer idBook) {repository.deleteById(idBook);
        return true;
    }


    public Book putBook(Integer idBook, Book book) {
        Book aux = this.getBookId(idBook);

        aux.setNameBook(book.getNameBook());
        aux.setNameAuthor(book.getNameAuthor());
        aux.setStock(book.getStock());

        return repository.save(aux);
    }

    public Book getBookId(Integer idBook){
        return repository.findById(idBook).get();
    }

    public List<Book> getBookLst(){return repository.findAll();}
}
