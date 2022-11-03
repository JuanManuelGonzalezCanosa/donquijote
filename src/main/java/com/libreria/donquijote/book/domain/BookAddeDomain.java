package com.libreria.donquijote.book.domain;


import lombok.Getter;

@Getter
public class BookAddeDomain {


    private final String id;

    private final String nameBook;

    private final String nameAuthor;

    private final Integer stock;

    private final Double price;

    public BookAddeDomain(String id, String nameBook, String nameAuthor, Integer stock, Double price) {
        this.id = id;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.stock = stock;
        this.price = price;
    }
}
