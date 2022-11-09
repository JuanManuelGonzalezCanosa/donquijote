package com.libreria.donquijote.payments_partial.domain.validations.status;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentsPartialStatus {

    private boolean status;

    public void validate(boolean status){
        if(!status){
            throw new PymentsExeption("La tarjeta no esta HABILITADA");
        }
    }
}
