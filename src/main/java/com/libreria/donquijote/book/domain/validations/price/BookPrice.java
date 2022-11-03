package com.libreria.donquijote.book.domain.validations.price;

import com.libreria.donquijote.book.domain.exception.BookException;
import com.libreria.donquijote.kernel.domain.ValueObject;

public class BookPrice implements ValueObject {

    private Double price;

    public BookPrice(Double price) {
        this.price = price;
    }

    public BookPrice() {
    }


    public void validate(float price){
        if(price < 0){
            throw new BookException("Error el precio es NEGATIVO");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
