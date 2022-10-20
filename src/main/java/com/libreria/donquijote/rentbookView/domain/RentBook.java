package com.libreria.donquijote.rentbookView.domain;

import javax.persistence.Id;
import java.time.LocalDate;

//@Document(name = "rentbookview")
public class RentBook {
    @Id
    private Integer id;
    private Book book;
    private Client client;
    private Integer stock;
    private LocalDate initDate;
    private LocalDate endDate;
    private Boolean returned;
}
