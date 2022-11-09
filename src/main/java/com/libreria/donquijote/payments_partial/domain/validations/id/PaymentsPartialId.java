package com.libreria.donquijote.payments_partial.domain.validations.id;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentsPartialId {

    private Integer id;

    public void validate(Integer id){
        if(id < 0){
            throw new PymentsExeption("ID negativa");
        }
    }
}
