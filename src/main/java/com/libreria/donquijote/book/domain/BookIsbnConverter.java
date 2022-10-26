package com.libreria.donquijote.book.domain;

import com.sun.istack.NotNull;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BookIsbnConverter implements AttributeConverter<BookIsbn, String> {
    @Override
    public @NotNull String convertToDatabaseColumn(BookIsbn bookIsbn) {
        return bookIsbn.toString();
    }

    @Override
    public BookIsbn convertToEntityAttribute(String s) {
        return new BookIsbn(s);
    }
}
