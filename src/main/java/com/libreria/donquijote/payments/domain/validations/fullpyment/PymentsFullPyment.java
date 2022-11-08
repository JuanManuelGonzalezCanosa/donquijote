package com.libreria.donquijote.payments.domain.validations.fullpyment;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PymentsFullPyment {

    private float fullPyment;

    public void validate(float fullPyment){
        if(fullPyment < 0){
            throw new PymentsExeption("Error el Pago no puede ser negativo");
        }
    }



}
