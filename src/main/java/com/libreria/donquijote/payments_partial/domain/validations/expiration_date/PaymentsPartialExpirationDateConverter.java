package com.libreria.donquijote.payments_partial.domain.validations.expiration_date;

import javax.persistence.AttributeConverter;
import java.time.LocalDate;

public class PaymentsPartialExpirationDateConverter implements AttributeConverter<PaymentsPartialExpirationDate, LocalDate> {
    @Override
    public LocalDate convertToDatabaseColumn(PaymentsPartialExpirationDate attribute) {
        return attribute.getExpirationDate();
    }

    @Override
    public PaymentsPartialExpirationDate convertToEntityAttribute(LocalDate dbData) {
        return new PaymentsPartialExpirationDate(dbData);
    }
}
