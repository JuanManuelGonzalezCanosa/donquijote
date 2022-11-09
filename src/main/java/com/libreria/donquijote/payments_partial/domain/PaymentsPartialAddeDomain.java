package com.libreria.donquijote.payments_partial.domain;


import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PaymentsPartialAddeDomain {

    private final Integer id;

    private final LocalDate expirationDate;

    private final float surchargeTaxes;

    private final int cantInstallments;

    private final boolean status;

    public PaymentsPartialAddeDomain(Integer id, LocalDate expirationDate, float surchargeTaxes, int cantInstallments, boolean status) {
        this.id = id;
        this.expirationDate = expirationDate;
        this.surchargeTaxes = surchargeTaxes;
        this.cantInstallments = cantInstallments;
        this.status = status;
    }
}
