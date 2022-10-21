package com.libreria.donquijote.book.domain;

public class BookIsEmpety extends RuntimeException{
    public BookIsEmpety(String message) {
        super(message);
    }
}
