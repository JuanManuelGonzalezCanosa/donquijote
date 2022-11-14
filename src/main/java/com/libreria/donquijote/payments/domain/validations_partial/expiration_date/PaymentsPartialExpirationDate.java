package com.libreria.donquijote.payments.domain.validations_partial.expiration_date;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
public class PaymentsPartialExpirationDate implements Serializable  {

    private final LocalDate expirationDate;


    PaymentsPartialExpirationDate(LocalDate expirationDate){
        this.expirationDate = validate(expirationDate);
    }

    public LocalDate validate(LocalDate expirationDate){
        if(expirationDate.isBefore(LocalDate.now())){
            throw new PymentsExeption("Error la fecha no puede ser ANTERIOR a la actual");
        }

        return expirationDate;
    }
}
