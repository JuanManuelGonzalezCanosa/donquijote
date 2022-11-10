package com.libreria.donquijote.payments.domain.validations_partial.cant_installments;

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
