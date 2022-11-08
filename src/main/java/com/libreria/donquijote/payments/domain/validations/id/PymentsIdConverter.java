package com.libreria.donquijote.payments.domain.validations.id;


import javax.persistence.AttributeConverter;

public class PymentsIdConverter implements AttributeConverter<PymentsId, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PymentsId attribute) {
        return attribute.getId();
    }

    @Override
    public PymentsId convertToEntityAttribute(Integer dbData) {
        return new PymentsId(dbData);
    }
}
