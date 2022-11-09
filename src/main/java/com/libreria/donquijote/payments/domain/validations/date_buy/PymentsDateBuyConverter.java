package com.libreria.donquijote.payments.domain.validations.date_buy;


import javax.persistence.AttributeConverter;
import java.time.LocalDate;

public class PymentsDateBuyConverter implements AttributeConverter<PymentsDateBuy, LocalDate> {
    @Override
    public LocalDate convertToDatabaseColumn(PymentsDateBuy attribute) {
        return attribute.getDate();
    }

    @Override
    public PymentsDateBuy convertToEntityAttribute(LocalDate dbData) {
        return new PymentsDateBuy(dbData);
    }
}
