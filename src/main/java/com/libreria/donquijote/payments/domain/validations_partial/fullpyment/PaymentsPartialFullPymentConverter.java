package com.libreria.donquijote.payments.domain.validations_partial.fullpyment;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PaymentsPartialFullPymentConverter implements AttributeConverter<PaymentsPartialFullPyment, Double> {
    @Override
    public Double convertToDatabaseColumn(PaymentsPartialFullPyment attribute) {
        return attribute.getFullPyment();
    }

    @Override
    public PaymentsPartialFullPyment convertToEntityAttribute(Double dbData) {
        return new PaymentsPartialFullPyment(dbData);
    }
}
