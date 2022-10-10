package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;

import java.time.LocalDate;

public interface IRentProxy {

    void validateStock(RentBook rentBook, Book book)throws Exception;
    void validateReturnDate(RentBook rentBook, LocalDate retunDate)throws Exception;
}
