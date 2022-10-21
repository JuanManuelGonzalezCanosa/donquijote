package com.libreria.donquijote.book.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Name_Book", nullable = false)
    private String nameBook;

    @Column(name = "Name_Author", nullable = false)
    private String nameAuthor;

    @Column(name = "Stock", nullable = false)
    private Integer stock;

    @Column(name = "Price", nullable = false)
    private float price;

}
