package com.libreria.donquijote.payments.domain;


import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PaymentsAddeDomain {

    private final Integer id;

    private final LocalDate date;

    private final float amount;

    private final float fullPyment;

    private final boolean type;

    public PaymentsAddeDomain(Integer id, LocalDate date, float amount, float fullPyment, boolean type) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.fullPyment = fullPyment;
        this.type = type;
    }
}
