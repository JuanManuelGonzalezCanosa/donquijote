package com.libreria.donquijote.book.domain;


import com.libreria.donquijote.book.domain.isbn.BookIsbn;
import com.libreria.donquijote.book.domain.isbn.BookIsbnConverter;
import com.libreria.donquijote.book.domain.nameauthor.BookNameAuthor;
import com.libreria.donquijote.book.domain.nameauthor.BookNameAuthorConvert;
import com.libreria.donquijote.book.domain.namebook.BookNameBook;
import com.libreria.donquijote.book.domain.price.BookPrice;
import com.libreria.donquijote.book.domain.stock.BookStock;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOOK")
public class Book implements Serializable {
    @Id
    @Convert(converter = BookIsbnConverter.class)
    private BookIsbn bookIsbn;

    @Column(name = "name_book", nullable = false)
    private BookNameBook nameBook;

    @Convert(converter = BookNameAuthorConvert.class)
    @Column(name = "full_name_author", nullable = false)
    private BookNameAuthor bookNameAuthor;

    @Column(name = "stock", nullable = false)
    private BookStock stock;

    @Column(name = "price", nullable = false)
    private BookPrice price;


}
