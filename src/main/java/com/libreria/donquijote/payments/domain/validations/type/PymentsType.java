package com.libreria.donquijote.payments.domain.validations.type;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PymentsType {

    private String type;

    public void validate(String type){
            if(!type.equalsIgnoreCase("credito") || !type.equalsIgnoreCase("debito") || !type.equalsIgnoreCase("efectivo")){
                throw new PymentsExeption("Error el Tipo de pago es Incorrecto");
            }
        }
    }

