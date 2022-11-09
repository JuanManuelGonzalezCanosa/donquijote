package com.libreria.donquijote.payments_partial.domain.validations.surcharge_taxes;

import javax.persistence.AttributeConverter;

public class PaymentsPartialSurchargeTaxesConverter implements AttributeConverter<PaymentsPartialSurchargeTaxes, Float> {
    @Override
    public Float convertToDatabaseColumn(PaymentsPartialSurchargeTaxes attribute) {
        return attribute.getTaxes();
    }

    @Override
    public PaymentsPartialSurchargeTaxes convertToEntityAttribute(Float dbData) {
        //return new PaymentsPartialSurchargeTaxes(dbData);
        //QUE TENDRIA QUE DEVOLVER ACA
        return null;
    }
}
