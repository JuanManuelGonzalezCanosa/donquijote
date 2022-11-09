package com.libreria.donquijote.payments_partial.domain.validations.surcharge_taxes;



import com.libreria.donquijote.payments_partial.domain.validations.expiration_date.PaymentsPartialExpirationDate;
import com.libreria.donquijote.payments_partial.domain.validations.return_date.PaymentsPartialReturnDate;
import static java.time.temporal.ChronoUnit.DAYS;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class PaymentsPartialSurchargeTaxes {


    private LocalDate expirationDate;

    private LocalDate returnDate;

    private float taxes;

    public float calculate(LocalDate expirationDate, LocalDate returnDate) {
        taxes = 0;
        if (expirationDate.isAfter(returnDate)) {
            long daysTaxes = DAYS.between(expirationDate, returnDate);
            daysTaxes = daysTaxes * 200;
            float taxes = daysTaxes;
        }

        return taxes;

    }

}
