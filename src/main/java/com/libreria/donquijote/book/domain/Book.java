package com.libreria.donquijote.book.domain;


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
    private String nameBook;

    @Convert(converter = BookNameAuthorConvert.class)
    @Column(name = "full_name_author", nullable = false)
    private BookNameAuthor bookNameAuthor;
    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "price", nullable = false)
    private float price;


}
