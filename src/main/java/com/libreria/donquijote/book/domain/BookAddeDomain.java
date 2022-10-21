package com.libreria.donquijote.book.domain;


import lombok.Getter;

@Getter
public class BookAddeDomain {


    private final Integer id;

    private final String nameBook;

    private final String nameAuthor;

    private final Integer stock;

    private final float price;

    public BookAddeDomain(Integer id, String nameBook, String nameAuthor, Integer stock, float price) {
        this.id = id;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.stock = stock;
        this.price = price;
    }
}
