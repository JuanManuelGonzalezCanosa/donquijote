package com.libreria.donquijote.book.application.put;

import com.libreria.donquijote.book.domain.Book;

public interface IBookPutService {

    Book putBook(Book book, Integer id);
}
