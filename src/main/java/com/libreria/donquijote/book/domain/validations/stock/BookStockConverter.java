package com.libreria.donquijote.book.domain.validations.stock;

import com.libreria.donquijote.book.domain.validations.price.BookPrice;
import com.sun.istack.NotNull;

import javax.persistence.AttributeConverter;

public class BookStockConverter implements AttributeConverter<BookStock, String> {

    @Override
    public String convertToDatabaseColumn(BookStock bookStock) {
        return bookStock.toString();
    }

    @Override
    public BookStock convertToEntityAttribute(String dbData) {
        return null;
    }

}
