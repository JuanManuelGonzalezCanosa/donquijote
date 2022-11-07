package com.libreria.donquijote.payments.infrastructure.controller;

import com.libreria.donquijote.payments.application.create.IPaymentsCreateService;
import com.libreria.donquijote.payments.domain.Payments;
import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmount;
import com.libreria.donquijote.payments.domain.validations.date.PymentsDate;
import com.libreria.donquijote.payments.domain.validations.fullpyment.PymentsFullPyment;
import com.libreria.donquijote.payments.domain.validations.id.PymentsId;
import com.libreria.donquijote.payments.domain.validations.type.PymentsType;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatePaymentsController implements ICreatePaymentsController{

    private final IPaymentsCreateService service;

    public CreatePaymentsController(IPaymentsCreateService service) {
        this.service = service;
    }

    @Override
    public Payments createPyments(PaymentsDTO paymentsDTO) {
        Payments payments = new Payments(new PymentsId(paymentsDTO.getId()),
                                         new PymentsDate(paymentsDTO.getDate()),
                                         new PymentsAmount(paymentsDTO.getAmount()),
                                         new PymentsFullPyment(paymentsDTO.getFullPyment()),
                                         new PymentsType(paymentsDTO.getType()));

        return service.createPayments(payments);
    }
}
