package com.libreria.donquijote.book.domain.validations.price;

import com.sun.istack.NotNull;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BookPriceConverter implements AttributeConverter<BookPrice, String> {


    @Override
    public @NotNull String convertToDatabaseColumn(BookPrice bookPrice) {
        return bookPrice.toString();
    }

    @Override
    public BookPrice convertToEntityAttribute(String dbData) {
        return null;
    }

}
