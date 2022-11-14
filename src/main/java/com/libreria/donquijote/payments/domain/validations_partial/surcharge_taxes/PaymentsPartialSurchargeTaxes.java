package com.libreria.donquijote.payments.domain.validations_partial.surcharge_taxes;



import static java.time.temporal.ChronoUnit.DAYS;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
public class PaymentsPartialSurchargeTaxes implements Serializable {

    private final Double taxes;
    public PaymentsPartialSurchargeTaxes(Double taxes) {
        this.taxes = taxes;
    }



    public Double calculate(LocalDate expirationDate, LocalDate returnDate) {
        Double taxes = Double.valueOf(0);
        if (expirationDate.isAfter(returnDate)) {
            long daysTaxes = DAYS.between(expirationDate, returnDate);
            daysTaxes = daysTaxes * 200;
             taxes = Double.valueOf(daysTaxes);
        }

        return taxes;

    }

}
