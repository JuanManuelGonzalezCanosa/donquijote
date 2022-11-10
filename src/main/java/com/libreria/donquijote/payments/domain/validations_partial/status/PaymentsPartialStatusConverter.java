package com.libreria.donquijote.payments.domain.validations_partial.status;

import javax.persistence.AttributeConverter;

public class PaymentsPartialStatusConverter implements AttributeConverter<PaymentsPartialStatus, Boolean> {
    @Override
    public Boolean convertToDatabaseColumn(PaymentsPartialStatus attribute) {
        return attribute.isStatus();
    }

    @Override
    public PaymentsPartialStatus convertToEntityAttribute(Boolean dbData) {
        return new PaymentsPartialStatus(dbData);
    }
}
