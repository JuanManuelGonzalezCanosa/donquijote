package com.libreria.donquijote.book.domain.exception;

public class BookIsEmpety extends RuntimeException{
    public BookIsEmpety(String message) {
        super(message);
    }
}
