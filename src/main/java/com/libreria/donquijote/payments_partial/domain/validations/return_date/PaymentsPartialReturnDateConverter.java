package com.libreria.donquijote.payments_partial.domain.validations.return_date;

import javax.persistence.AttributeConverter;
import java.time.LocalDate;

public class PaymentsPartialReturnDateConverter implements AttributeConverter<PaymentsPartialReturnDate, LocalDate> {
    @Override
    public LocalDate convertToDatabaseColumn(PaymentsPartialReturnDate attribute) {
        return attribute.getReturnDate();
    }

    @Override
    public PaymentsPartialReturnDate convertToEntityAttribute(LocalDate dbData) {
        return new PaymentsPartialReturnDate(dbData);
    }
}
