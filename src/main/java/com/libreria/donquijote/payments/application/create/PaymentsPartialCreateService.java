package com.libreria.donquijote.payments.application.create;

import com.libreria.donquijote.payments.domain.IPaymentsPartialRepository;
import com.libreria.donquijote.payments.domain.PaymentsPartial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Qualifier("paymentspartialcreateservice")
public class PaymentsPartialCreateService implements IPaymentsPartialCreateService{

    @Qualifier("ipaymentspartialcreateservice")
    @Autowired
    private final IPaymentsPartialRepository repository;

    private final ApplicationEventPublisher applicationEventPublisher;

    public PaymentsPartialCreateService(IPaymentsPartialRepository repository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = repository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public PaymentsPartial createPaymentsPartial(PaymentsPartial paymentsPartial) {

        return repository.save(paymentsPartial);
    }
}
