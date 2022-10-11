package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    public void validateReturnDate(RentBook rentBook, String returnDate) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate returnLocalDate = LocalDate.parse(returnDate, formatter);


        if(rentBook.getRentDateBook().isBefore(returnLocalDate)){
            new Exception("ERROR la Fecha ingresada es Antes del Alquiler del Libro");
        }

        if(rentBook.getRentDateBookFinal().isAfter(returnLocalDate)){
            long days = DAYS.between(rentBook.getRentDateBookFinal(), returnLocalDate);

            float daily = days * (rentBook.getBook().getPrice() / 50);

            rentBook.setDailyBook(daily);
            rentBook.setTotalRent(rentBook.getBook().getPrice() + daily);
        }else{ rentBook.setTotalRent(rentBook.getBook().getPrice());}

        rentBook.setReturnDateBook(returnLocalDate);
    }

    @Override
    public void validateReturnDateII(RentBook rentBook) throws Exception {

        if(rentBook.getRentDateBook().isBefore(rentBook.getReturnDateBook())){
            new Exception("ERROR la Fecha ingresada es Antes del Alquiler del Libro");
        }

        if(!rentBook.getRentDateBookFinal().isAfter(rentBook.getReturnDateBook())){
            long days = DAYS.between(rentBook.getRentDateBookFinal(), rentBook.getReturnDateBook());

            float daily = days * (rentBook.getBook().getPrice() / 50);

            rentBook.setDailyBook(daily);
            rentBook.setTotalRent(rentBook.getBook().getPrice() + daily);
        }else{ rentBook.setTotalRent(rentBook.getBook().getPrice());}

        rentBook.getBook().setStock(rentBook.getBook().getStock() + 1);
        rentBook.setReturnDateBook(rentBook.getReturnDateBook());
    }

}
