package com.libreria.donquijote.book.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOOK")
public class Book implements Serializable {
    @Convert(converter = BookIsbnConverter.class)
    private BookIsbn bookIsbn;

    @Column(name = "name_book", nullable = false)
    private String nameBook;

    @Convert(converter = BookNameAuthorConvert.class)
    private BookNameAuthor bookNameAuthor;
    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "price", nullable = false)
    private float price;

    @Id
    public BookIsbn getBookIsbn() {
        return bookIsbn;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Column(name = "full_name_author", nullable = false)
    public BookNameAuthor getBookNameAuthor() {
        return bookNameAuthor;
    }

    public Integer getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }
}
