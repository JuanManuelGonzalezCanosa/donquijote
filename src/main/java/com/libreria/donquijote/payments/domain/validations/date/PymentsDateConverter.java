package com.libreria.donquijote.payments.domain.validations.date;


import javax.persistence.AttributeConverter;
import java.time.LocalDate;

public class PymentsDateConverter implements AttributeConverter<PymentsDate, LocalDate> {
    @Override
    public LocalDate convertToDatabaseColumn(PymentsDate attribute) {
        return attribute.getDate();
    }

    @Override
    public PymentsDate convertToEntityAttribute(LocalDate dbData) {
        return new PymentsDate(dbData);
    }
}
