package com.libreria.donquijote.proxy;

import com.libreria.donquijote.dto.ReturnDateBookRent;
import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

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

    @Override
    public void validateReturnDate(RentBook rentBook, ReturnDateBookRent returnDate) throws Exception {
        LocalDate returnDateFinal = LocalDate.of(returnDate.getYear(), returnDate.getMonth(), returnDate.getDay());

        rentBook.setDailyBook(0);

        if(!returnDateFinal.isBefore(rentBook.getRentDateBook())){
            new Exception("ERROR la Fecha ingresada es Antes del Alquiler del Libro");
        }

        if(!rentBook.getRentDateBookFinal().isAfter(returnDateFinal)){
            long days = DAYS.between(rentBook.getRentDateBookFinal(), returnDateFinal);

            float daily = days * (rentBook.getBook().getPrice() / 50);

            rentBook.setDailyBook(daily);
            rentBook.setTotalRent(rentBook.getBook().getPrice() + daily);
        }else{ rentBook.setTotalRent(rentBook.getBook().getPrice());}

        rentBook.setReturnDateBook(returnDateFinal);
    }

}
