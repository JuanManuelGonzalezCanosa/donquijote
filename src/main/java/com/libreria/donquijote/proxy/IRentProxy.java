package com.libreria.donquijote.proxy;

import com.libreria.donquijote.dto.ReturnDateBookRent;
import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;

public interface IRentProxy {

    void validateStock(RentBook rentBook, Book book)throws Exception;
    void validateReturnDate(RentBook rentBook, ReturnDateBookRent retunDate)throws Exception;

}
