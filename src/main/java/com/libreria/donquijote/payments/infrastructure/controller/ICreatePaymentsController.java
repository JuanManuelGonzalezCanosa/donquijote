package com.libreria.donquijote.payments.infrastructure.controller;

import com.libreria.donquijote.payments.domain.Payments;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/payments/")
@Validated
public interface ICreatePaymentsController {

    @PostMapping("create")
    Payments createPyments(@RequestBody PaymentsDTO paymentsDTO);
}
