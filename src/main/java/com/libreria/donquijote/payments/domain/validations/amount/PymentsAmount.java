package com.libreria.donquijote.payments.domain.validations.amount;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PymentsAmount {

    private float amount;

    public void validate(float amount) {
        if (amount < 0) {
            throw new PymentsExeption("Error el precio es NEGATIVO");
        }
    }
}
