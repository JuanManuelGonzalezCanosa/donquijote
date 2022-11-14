package com.libreria.donquijote.payments.domain.validations_partial.status;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class PaymentsPartialStatus implements Serializable {

    private final Boolean status;


    public PaymentsPartialStatus(Boolean status) {
        this.status = validate(status);
    }

    public boolean validate(Boolean status){
        if(!status){
            throw new PymentsExeption("La tarjeta no esta HABILITADA");
        }
        return true;
    }
}
