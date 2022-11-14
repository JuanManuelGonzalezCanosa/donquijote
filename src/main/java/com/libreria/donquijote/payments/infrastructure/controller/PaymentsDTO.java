package com.libreria.donquijote.payments.infrastructure.controller;

import com.libreria.donquijote.payments.domain.PaymentsPartial;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class PaymentsDTO {

    private Integer id;
    private LocalDate date;
    private Double amount;
    private String type;
    private List<PaymentsPartial> paymentsPartialList;
}
