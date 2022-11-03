package com.libreria.donquijote.book.domain.validations.namebook;

import com.libreria.donquijote.book.domain.Book;

import javax.persistence.AttributeConverter;

public class BookNameBookConverter implements AttributeConverter<BookNameBook, String> {

    private Book book;

    @Override
    public String convertToDatabaseColumn(BookNameBook bookNameBook) {
        if(bookNameBook == null){
            return null;
        }
        return bookNameBook.toString();
    }

    @Override
    public BookNameBook convertToEntityAttribute(String dbData) {
        if(dbData == null){
            return null;
        }

        BookNameBook bookNameBook = new BookNameBook(dbData);

        return bookNameBook;

}
}
