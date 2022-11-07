package com.libreria.donquijote.payments.application.create;

import com.libreria.donquijote.payments.domain.Payments;

public interface IPaymentsCreateService {

    Payments createPayments(Payments payments);
}
