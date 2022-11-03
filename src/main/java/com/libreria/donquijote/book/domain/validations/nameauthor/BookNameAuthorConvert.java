package com.libreria.donquijote.book.domain.validations.nameauthor;

import com.libreria.donquijote.book.domain.Book;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BookNameAuthorConvert implements AttributeConverter<BookNameAuthor, String> {

    private static final String SEPARATOR = " ";

    // AGREGE ESTO PARA QUE NO ME TIRE ERROR
    private Book book;

    @Override
    public String convertToDatabaseColumn(BookNameAuthor bookNameAuthor) {
        if (bookNameAuthor == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        if (bookNameAuthor.getFirstName() != null && !bookNameAuthor.getLastName()
                .isEmpty()) {
            sb.append(bookNameAuthor.getFirstName());
            sb.append(SEPARATOR);
        }

        if (bookNameAuthor.getLastName() != null
                && !bookNameAuthor.getLastName().isEmpty()) {
            sb.append(bookNameAuthor.getLastName());
        }

        return sb.toString();
    }

   @Override
    public BookNameAuthor convertToEntityAttribute(String dbPersonName) {
        if (dbPersonName == null || dbPersonName.isEmpty()) {
            return null;
        }

        String[] pieces = dbPersonName.split(SEPARATOR);

        if (pieces == null || pieces.length == 0) {
            return null;
        }

        BookNameAuthor bookNameAuthor = new BookNameAuthor(book.getBookNameAuthor().getFirstName(), book.getBookNameAuthor().getLastName());
        String firstPiece = !pieces[0].isEmpty() ? pieces[0] : null;
        if (dbPersonName.contains(SEPARATOR)) {
            bookNameAuthor.setFirstName(firstPiece);

            if (pieces.length >= 2 && pieces[1] != null
                    && !pieces[1].isEmpty()) {
                bookNameAuthor.setLastName(pieces[1]);
            }
        } else {
            bookNameAuthor.setLastName(firstPiece);
        }

        return bookNameAuthor;
    }
}
