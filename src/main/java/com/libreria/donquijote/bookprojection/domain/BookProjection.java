package com.libreria.donquijote.bookprojection.domain;

import javax.persistence.Converter;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "BOOKPROJECTION")
public class BookProjection implements Serializable {

    @javax.persistence.Id
    private Long Id;
    @Converter
    private BookRead bookRead;
}