package com.libreria.donquijote.payments.domain.validations.id;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PymentsId {

    private Integer id;

    public void validate(Integer id){
        if(id < 0){
            throw new PymentsExeption("Error ID negativa");
        }
    }

}
