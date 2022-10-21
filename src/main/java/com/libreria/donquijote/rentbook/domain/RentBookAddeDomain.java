package com.libreria.donquijote.rentbook.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class RentBookAddeDomain {

    private final String name = "rent.book.added";
    private final Integer id;
    private final Integer bookId;
    private final Integer clientId;
    private final Double rentPrice;
    private final LocalDate initDate;
    private final LocalDate endDate;
    private final Boolean returned;

    public RentBookAddeDomain(Integer id, Integer bookId, Integer clientId, Double rentPrice, LocalDate initDate, LocalDate endDate, Boolean returned) {
        this.id = id;
        this.bookId = bookId;
        this.clientId = clientId;
        this.rentPrice = rentPrice;
        this.initDate = initDate;
        this.endDate = endDate;
        this.returned = returned;
    }
}
