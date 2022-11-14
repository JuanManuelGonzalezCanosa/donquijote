package com.libreria.donquijote.payments.domain.validations.amount;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class PymentsAmount implements Serializable {

    private final Double amount;

    public PymentsAmount(Double amount){
        this.amount = validate(amount);
    }

    public Double validate(Double amount) {
        if (amount < 0) {
            throw new PymentsExeption("Error el precio es NEGATIVO");
        }

        return amount;
    }
}
