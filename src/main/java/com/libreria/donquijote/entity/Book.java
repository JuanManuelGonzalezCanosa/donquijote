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
    @Column(name = "idbook", nullable = false)
    private Integer idBook;


    @Column(name = "namebook", nullable = false)
    private String nameBook;

    @Column(name = "nameauthor", nullable = false)
    private String nameAuthor;

    @Column(name = "stock", nullable = false)
    private int stock;
}
