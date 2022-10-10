package com.libreria.donquijote.service;


import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;
import com.libreria.donquijote.proxy.RentProxy;
import com.libreria.donquijote.repository.IBookRepository;
import com.libreria.donquijote.repository.IRentBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("rentbookservice")
@Service
public class RentBookService {

    @Autowired
    private IRentBookRepository repository;

    @Autowired
    private IBookRepository repositoryBook;

    public RentBook rentBook(Book book) throws Exception{
        RentBook rentBook = new RentBook();
        RentProxy rentProxy = new RentProxy(rentBook);

        rentProxy.validateStock(rentBook, book);

        repositoryBook.save(book);
        return repository.save(rentBook);
    }

    public RentBook putRentBook(RentBook rentBook, Integer idBookRent) {
        RentBook aux = this.getRentId(idBookRent);

        aux.setBook(rentBook.getBook());
        aux.setRentDateBook(rentBook.getRentDateBook());
        aux.setRentDateBookFinal(rentBook.getRentDateBookFinal());

        return repository.save(aux);
    }

    public boolean deleteRent(Integer idRentBook) {
        repository.deleteById(idRentBook);

        return true;
    }

    public RentBook getRentId(Integer idRentBook) {return repository.findById(idRentBook).get();}

    public List<RentBook> getRentLst() {return  repository.findAll();}


    //HACER LA DEVOLUCION DEL LIBRO Y SUMAR LOS DIAS ATRASADOS SI ES QUE TIENE
    //public RentBook returnRent() {
    //}
}
