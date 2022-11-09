package com.libreria.donquijote.payments_partial.domain.validations.cant_installments;

import javax.persistence.AttributeConverter;

public class PaymentsPartialCantInstallmentsConverter implements AttributeConverter<PaymentsPartialCantInstallments, Integer> {


    @Override
    public Integer convertToDatabaseColumn(PaymentsPartialCantInstallments attribute) {
        return attribute.getCantInstallments();
    }

    @Override
    public PaymentsPartialCantInstallments convertToEntityAttribute(Integer dbData) {
        return new PaymentsPartialCantInstallments(dbData);
    }
}
