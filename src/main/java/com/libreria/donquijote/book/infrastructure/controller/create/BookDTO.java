package com.libreria.donquijote.book.infrastructure.controller.create;

import lombok.Data;

@Data
public class BookDTO {

    private String id;
    private String nameBook;
    private String authorName;
    private String authorLastName;
    private Integer stock;
    private float price;
}
