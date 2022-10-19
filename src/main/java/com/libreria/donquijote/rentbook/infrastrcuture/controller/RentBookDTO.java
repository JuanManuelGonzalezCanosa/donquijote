package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.sun.istack.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RentBookDTO {

    private Integer id;
    @NotNull
    private Integer bookId;
    @NotNull
    private Integer clientId;
    private Double rentPrice;
    private LocalDate initDate;
    private LocalDate endDate;
    private Boolean returned;
}
