package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.BuyBook;

public interface IBuyProxy {
    void validateStock(BuyBook buyBook, Book book) throws Exception;
}
