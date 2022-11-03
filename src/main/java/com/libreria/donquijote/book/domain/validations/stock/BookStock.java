package com.libreria.donquijote.book.domain.validations.stock;

import com.libreria.donquijote.book.domain.exception.BookException;
import com.libreria.donquijote.kernel.domain.ValueObject;

public class BookStock implements ValueObject {

    private Integer stock;

    public BookStock(Integer stock) {
        this.stock = stock;
    }

    public BookStock() {

    }

    public void validate(Integer stock){
        if(stock < 0){
            throw new BookException("Error el stock es NEGATIVO");
        }
    }

    @Override
    public String toString() {
        return stock.toString();

    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
