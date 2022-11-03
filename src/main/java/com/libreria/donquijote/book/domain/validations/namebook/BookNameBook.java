package com.libreria.donquijote.book.domain.validations.namebook;

import com.libreria.donquijote.book.domain.exception.BookException;
import com.libreria.donquijote.kernel.domain.ValueObject;
import com.sun.istack.NotNull;


public class BookNameBook implements ValueObject {

    private String nameBook;

    public BookNameBook(@NotNull String nameBook) {
        this.nameBook = nameBook;
    }

    public BookNameBook() {

    }


    public void validate(String nameBook){
        if(!nameBook.matches("[A-Z]*" + "[0-9]*")){
            throw new BookException("Error el libro no tiene letras ni numeros");
        }
    }

    @Override
    public String toString() {
        return  nameBook + " ";
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
