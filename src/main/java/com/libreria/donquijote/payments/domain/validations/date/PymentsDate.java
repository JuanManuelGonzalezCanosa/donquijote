package com.libreria.donquijote.payments.domain.validations.date;

import com.libreria.donquijote.payments.domain.exception.PymentsExeption;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class PymentsDate {

    private LocalDate date;

    public void validate(LocalDate date){
        if(date.isBefore(LocalDate.now())){
            throw new PymentsExeption("Error la fecha de Compra en antigua");
        }
    }
}
