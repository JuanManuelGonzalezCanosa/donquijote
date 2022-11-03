package com.libreria.donquijote.book.domain.validations.price;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BookPriceConverter implements AttributeConverter<BookPrice, Double> {


    @Override
    public Double convertToDatabaseColumn(BookPrice bookPrice) {
        return bookPrice.getPrice();
    }

    @Override
    public BookPrice convertToEntityAttribute(Double dbData) {
        return new BookPrice(dbData);
    }

}
