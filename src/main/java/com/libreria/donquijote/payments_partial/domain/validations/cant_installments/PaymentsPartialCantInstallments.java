package com.libreria.donquijote.payments_partial.domain.validations.cant_installments;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentsPartialCantInstallments {

    private Integer CantInstallments;

    public void validate(Integer cantInstallments){
        if(cantInstallments < 0){
            throw new PymentsExeption("Error las CUOTAS no pueden ser negativas");
        }
        if(cantInstallments > 24){
            throw new PymentsExeption("Error las CUOTAS no pueden ser superiores a 24 meses");
        }
    }
}
