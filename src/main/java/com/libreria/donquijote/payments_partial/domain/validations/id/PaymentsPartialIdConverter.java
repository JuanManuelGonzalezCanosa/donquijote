package com.libreria.donquijote.payments_partial.domain.validations.id;

import javax.persistence.AttributeConverter;

public class PaymentsPartialIdConverter implements AttributeConverter<PaymentsPartialId, Integer> {
    @Override
    public Integer convertToDatabaseColumn(PaymentsPartialId attribute) {
        return attribute.getId();
    }

    @Override
    public PaymentsPartialId convertToEntityAttribute(Integer dbData) {
        return new PaymentsPartialId(dbData);
    }
}
