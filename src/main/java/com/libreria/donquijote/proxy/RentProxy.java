package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;

import java.time.LocalDate;

public class RentProxy implements IRentProxy{

    private final RentBook rentBook;

    public RentProxy(RentBook rentBook){
        this.rentBook = rentBook;
    }

    @Override
    public void validateStock(RentBook rentBook, Book book) throws Exception {

        if(book.getStock() <= 0){
            throw new Exception("Error no hay STOCK");
        }

        book.setStock(book.getStock() - 1);
        rentBook.setBook(book);
        rentBook.setRentDateBook(LocalDate.now());
        rentBook.setRentDateBookFinal(LocalDate.now().plusMonths(1));

    }
}
