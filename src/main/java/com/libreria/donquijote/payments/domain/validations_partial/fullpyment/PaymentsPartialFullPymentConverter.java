package com.libreria.donquijote.payments.domain.validations_partial.fullpyment;


import javax.persistence.AttributeConverter;

public class PaymentsPartialFullPymentConverter implements AttributeConverter<PaymentsPartialFullPyment, Float> {
    @Override
    public Float convertToDatabaseColumn(PaymentsPartialFullPyment attribute) {
        return attribute.getFullPyment();
    }

    @Override
    public PaymentsPartialFullPyment convertToEntityAttribute(Float dbData) {
        return new PaymentsPartialFullPyment(dbData);
    }
}
