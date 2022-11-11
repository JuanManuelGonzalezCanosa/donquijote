package com.libreria.donquijote.payments.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PaymentsPartialAddeDomain {

    private final Integer id;

    private final LocalDate expirationDate;

    private final float surchargeTaxes;

    private final float fullPyment;

    private final boolean status;

}
