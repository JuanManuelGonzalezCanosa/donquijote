package com.libreria.donquijote.book.domain.validations.price;

import com.libreria.donquijote.book.domain.exception.BookException;
import com.libreria.donquijote.kernel.domain.ValueObject;

public class BookPrice implements ValueObject {

    private float price;

    public BookPrice(float price) {
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
        return "BookPrice{" +
                "price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
