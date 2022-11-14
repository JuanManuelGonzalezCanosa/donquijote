package com.libreria.donquijote.payments.domain.validations_partial.surcharge_taxes;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PaymentsPartialSurchargeTaxesConverter implements AttributeConverter<PaymentsPartialSurchargeTaxes, Double> {
    @Override
    public Double convertToDatabaseColumn(PaymentsPartialSurchargeTaxes attribute) {
        return attribute.getTaxes();
    }

    @Override
    public PaymentsPartialSurchargeTaxes convertToEntityAttribute(Double dbData) {
        return new PaymentsPartialSurchargeTaxes(dbData);
        //QUE TENDRIA QUE DEVOLVER ACA
    }
}
