package com.libreria.donquijote.service;


import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;
import com.libreria.donquijote.repository.IRentBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Qualifier("rentbookservice")
@Service
public class RentBookService {

    @Autowired
    private IRentBookRepository repository;

    public RentBook rentBook(Book book) throws Exception{
        RentBook aux = new RentBook();

        if(book.getStock() <= 0){
            throw new Exception("Error no hay STOCK");
        }

        aux.setBook(book);
        aux.setRentDateBook(LocalDate.now());
        aux.setRentDateBookFinal(LocalDate.now().plusMonths(1));

        return repository.save(aux);
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
