package com.libreria.donquijote.book.application.get;

import com.libreria.donquijote.book.domain.Book;

import java.util.List;

public interface IBookGetService {

    Book getBookId(Integer id);

    List<Book> getBookLst();
}
