package com.libreria.donquijote.book.application.abm;

import com.libreria.donquijote.book.domain.Book;

public interface IBookPutService {

    Book putBook(Book book, Integer id);
}
