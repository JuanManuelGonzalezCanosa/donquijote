package com.libreria.donquijote.payments.domain;

import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmount;
import com.libreria.donquijote.payments.domain.validations.date.PymentsDate;
import com.libreria.donquijote.payments.domain.validations.fullpyment.PymentsFullPyment;
import com.libreria.donquijote.payments.domain.validations.id.PymentsId;
import com.libreria.donquijote.payments.domain.validations.type.PymentsType;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAYMENTS")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private PymentsId id;

    @Column(name = "date")
    private PymentsDate Date;

    @Column(name = "amount")
    private PymentsAmount amount;

    @Column(name = "full_pyment")
    private PymentsFullPyment fullPyment;

    @Column(name = "type")
    private PymentsType type;

}
