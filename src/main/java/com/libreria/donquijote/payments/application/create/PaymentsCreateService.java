package com.libreria.donquijote.payments.application.create;

import com.libreria.donquijote.payments.domain.IPaymentsRepository;
import com.libreria.donquijote.payments.domain.Payments;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PaymentsCreateService implements IPaymentsCreateService{

    private final IPaymentsRepository repository;

    private final ApplicationEventPublisher applicationEventPublisher;

    public PaymentsCreateService(@Qualifier("ipaymentsrepository") IPaymentsRepository repository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = repository;
        this.applicationEventPublisher = applicationEventPublisher;
    }


    @Override
    public Payments createPayments(Payments payments) {
        return null;
    }
}
