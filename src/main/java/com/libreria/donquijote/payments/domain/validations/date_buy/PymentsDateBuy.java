package com.libreria.donquijote.payments.domain.validations.date_buy;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
public class PymentsDateBuy implements Serializable {

    private final LocalDate date;

    public PymentsDateBuy(LocalDate date) {
        this.date = validate(date);
    }

    public LocalDate validate(LocalDate date){
        if(date.isBefore(LocalDate.now())){
            throw new PymentsExeption("Error la fecha de Compra en antigua");
        }
        return date;
    }
}
