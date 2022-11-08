package com.libreria.donquijote.payments.domain.validations.type;

import javax.persistence.AttributeConverter;

public class PymentsTypeConverter implements AttributeConverter<PymentsType, String> {


    @Override
    public String convertToDatabaseColumn(PymentsType attribute) {
        return attribute.getType();
    }

    @Override
    public PymentsType convertToEntityAttribute(String dbData) {
        return new PymentsType(dbData);
    }
}