package com.libreria.donquijote.payments.domain.validations.type;


import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class PymentsType implements Serializable {

    private final String type;

    public PymentsType(String type){
        this.type = validate(type);
    }

    public String validate(String type){
            if(!type.equalsIgnoreCase("credito") || !type.equalsIgnoreCase("debito") || !type.equalsIgnoreCase("efectivo")){
                throw new PymentsExeption("Error el Tipo de pago es Incorrecto");
            }
        return type;
        }
    }

