package com.libreria.donquijote.payments.domain.validations.amount;


import javax.persistence.AttributeConverter;

public class PymentsAmountConverter implements AttributeConverter<PymentsAmount, Float> {

    @Override
    public Float convertToDatabaseColumn(PymentsAmount attribute) {
        return attribute.getAmount();
    }

    @Override
    public PymentsAmount convertToEntityAttribute(Float dbData) {
        return new PymentsAmount(dbData);
    }

}
