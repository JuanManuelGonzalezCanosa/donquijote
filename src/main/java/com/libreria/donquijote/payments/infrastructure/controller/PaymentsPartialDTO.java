package com.libreria.donquijote.payments.infrastructure.controller;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PaymentsPartialDTO {

    private Integer id;
    private LocalDate date;
    private float amount;
    private float fullPyment;
    private boolean type;

}
