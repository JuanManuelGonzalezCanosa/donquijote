package com.libreria.donquijote.payments.domain.validations.fullpyment;


import javax.persistence.AttributeConverter;

public class PymentsFullPymentConverter implements AttributeConverter<PymentsFullPyment, Float> {
    @Override
    public Float convertToDatabaseColumn(PymentsFullPyment attribute) {
        return attribute.getFullPyment();
    }

    @Override
    public PymentsFullPyment convertToEntityAttribute(Float dbData) {
        return new PymentsFullPyment(dbData);
    }
}
