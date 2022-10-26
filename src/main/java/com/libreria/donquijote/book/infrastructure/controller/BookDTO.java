package com.libreria.donquijote.book.infrastructure.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {

    private Integer id;

    private String nameBook;

    private String nameAuthor;

    private Integer stock;

    private float price;
}
