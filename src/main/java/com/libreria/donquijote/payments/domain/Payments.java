package com.libreria.donquijote.payments.domain;

import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmount;
import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmountConverter;
import com.libreria.donquijote.payments.domain.validations.date_buy.PymentsDateBuy;
import com.libreria.donquijote.payments.domain.validations.date_buy.PymentsDateBuyConverter;
import com.libreria.donquijote.payments.domain.validations.fullpyment.PymentsFullPyment;
import com.libreria.donquijote.payments.domain.validations.fullpyment.PymentsFullPymentConverter;
import com.libreria.donquijote.payments.domain.validations.id.PymentsId;
import com.libreria.donquijote.payments.domain.validations.id.PymentsIdConverter;
import com.libreria.donquijote.payments.domain.validations.type.PymentsType;
import com.libreria.donquijote.payments.domain.validations.type.PymentsTypeConverter;
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
    @Convert(converter = PymentsIdConverter.class)
    @Column(name = "id")
    private PymentsId id;

    @Column(name = "date")
    @Convert(converter = PymentsDateBuyConverter.class)
    private PymentsDateBuy DateBuy;

    @Column(name = "amount")
    @Convert(converter = PymentsAmountConverter.class)
    private PymentsAmount amount;

    @Column(name = "full_pyment")
    @Convert(converter = PymentsFullPymentConverter.class)
    private PymentsFullPyment fullPyment;

    @Column(name = "type")
    @Convert(converter = PymentsTypeConverter.class)
    private PymentsType type;

}
