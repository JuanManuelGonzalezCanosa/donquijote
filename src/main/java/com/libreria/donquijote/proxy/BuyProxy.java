package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.BuyBook;

import java.time.LocalDate;

public class BuyProxy implements IBuyProxy{

    private final BuyBook buyBook;

    public BuyProxy(BuyBook buyBook){
        this.buyBook = buyBook;
    }

    @Override
    public void validateStock(BuyBook buyBook, Book book) throws Exception {

        if(book.getStock() <= 0){
            throw new Exception("Error no hay STOCK");
        }

        buyBook.setBook(book);
        book.setStock(book.getStock() - 1);
        buyBook.setBuyDateBook(LocalDate.now());

    }
}
