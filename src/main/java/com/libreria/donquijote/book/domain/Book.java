package com.libreria.donquijote.book.domain;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "BOOK", schema = "donquijotehexagonal")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name_book", nullable = false)
    private String nameBook;

    @Column(name = "name_author", nullable = false)
    private String nameAuthor;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "price", nullable = false)
    private float price;

}
