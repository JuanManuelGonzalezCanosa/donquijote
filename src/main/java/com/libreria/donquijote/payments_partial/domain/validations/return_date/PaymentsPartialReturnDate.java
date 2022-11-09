package com.libreria.donquijote.payments_partial.domain.validations.return_date;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class PaymentsPartialReturnDate {

    private LocalDate returnDate;

    public void validate(LocalDate returnDate){
        if(returnDate.isBefore(LocalDate.now())){
            throw new PymentsExeption("Error la fecha no puede ser ANTERIOR a la actual");
        }
    }
}
