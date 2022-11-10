package com.libreria.donquijote.payments.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PaymentsAddeDomain {

    private final Integer id;

    private final LocalDate date;

    private final float amount;

    private final boolean type;

}
