package com.libreria.donquijote.payments.domain.validations_partial.fullpyment;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class PaymentsPartialFullPyment implements Serializable {

    private final Double fullPyment;

    PaymentsPartialFullPyment( Double fullPyment){
        this.fullPyment = validate(fullPyment);
    }


    public Double validate(Double fullPyment){
        if(fullPyment < 0){
            throw new PymentsExeption("Error el Pago no puede ser negativo");
        }
        return fullPyment;
    }



}
