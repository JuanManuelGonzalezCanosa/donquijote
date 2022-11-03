package com.libreria.donquijote.book.domain.validations.stock;

import javax.persistence.AttributeConverter;

public class BookStockConverter implements AttributeConverter<BookStock, Integer> {

    @Override
    public Integer convertToDatabaseColumn(BookStock bookStock) {
        return bookStock.getStock();
    }

    @Override
    public BookStock convertToEntityAttribute(Integer dbData) {
        return new BookStock(dbData);
    }

}
