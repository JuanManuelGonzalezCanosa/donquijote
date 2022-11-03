package com.libreria.donquijote.book.domain;


import com.libreria.donquijote.book.domain.validations.isbn.BookIsbn;
import com.libreria.donquijote.book.domain.validations.isbn.BookIsbnConverter;
import com.libreria.donquijote.book.domain.validations.nameauthor.BookNameAuthor;
import com.libreria.donquijote.book.domain.validations.nameauthor.BookNameAuthorConvert;
import com.libreria.donquijote.book.domain.validations.namebook.BookNameBook;
import com.libreria.donquijote.book.domain.validations.namebook.BookNameBookConverter;
import com.libreria.donquijote.book.domain.validations.price.BookPrice;
import com.libreria.donquijote.book.domain.validations.price.BookPriceConverter;
import com.libreria.donquijote.book.domain.validations.stock.BookStock;
import com.libreria.donquijote.book.domain.validations.stock.BookStockConverter;
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
public class Book extends ItemBook implements Serializable{

    @Id
    @Convert(converter = BookIsbnConverter.class)
    private BookIsbn bookIsbn;

    @Convert(converter = BookNameBookConverter.class)
    @Column(name = "name_book", nullable = false)
    private BookNameBook nameBook;

    @Convert(converter = BookNameAuthorConvert.class)
    @Column(name = "full_name_author", nullable = false)
    private BookNameAuthor bookNameAuthor;

    @Convert(converter = BookStockConverter.class)
    @Column(name = "stock", nullable = false)
    private BookStock stock;

    @Convert(converter = BookPriceConverter.class)
    @Column(name = "price", nullable = false)
    private BookPrice price;


}
