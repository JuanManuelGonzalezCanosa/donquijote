package com.libreria.donquijote.payments.infrastructure.controller;

import com.libreria.donquijote.payments.application.create.IPaymentsCreateService;
import com.libreria.donquijote.payments.domain.Payments;
import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmount;
import com.libreria.donquijote.payments.domain.validations.date_buy.PymentsDateBuy;
import com.libreria.donquijote.payments.domain.validations_partial.fullpyment.PaymentsPartialFullPyment;
import com.libreria.donquijote.payments.domain.validations.id.PymentsId;
import com.libreria.donquijote.payments.domain.validations.type.PymentsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatePaymentsController implements ICreatePaymentsController{

    @Qualifier("paymentscreateservice")
    @Autowired
    private final IPaymentsCreateService service;

    public CreatePaymentsController(IPaymentsCreateService service) {
        this.service = service;
    }

    @Override
    public Payments createPyments(PaymentsDTO paymentsDTO) {
        Payments payments = new Payments(new PymentsId(paymentsDTO.getId()),
                                         new PymentsDateBuy(paymentsDTO.getDate()),
                                         new PymentsAmount(paymentsDTO.getAmount()),
                                         new PymentsType(paymentsDTO.getType()),
                                         paymentsDTO.getPaymentsPartialList());

        return service.createPayments(payments);
    }
}
