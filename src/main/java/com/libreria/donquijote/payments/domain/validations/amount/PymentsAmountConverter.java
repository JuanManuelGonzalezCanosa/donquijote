package com.libreria.donquijote.payments.domain.validations.amount;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PymentsAmountConverter implements AttributeConverter<PymentsAmount, Double> {

    @Override
    public Double convertToDatabaseColumn(PymentsAmount attribute) {
        return attribute.getAmount();
    }

    @Override
    public PymentsAmount convertToEntityAttribute(Double dbData) {
        return new PymentsAmount(dbData);
    }

}
