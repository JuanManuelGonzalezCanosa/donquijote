package com.libreria.donquijote.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_book", nullable = false)
    private Integer idBook;


    @Column(name = "name_book", nullable = false)
    private String nameBook;

    @Column(name = "name_author", nullable = false)
    private String nameAuthor;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "stock", nullable = false)
    private int stock;
}
