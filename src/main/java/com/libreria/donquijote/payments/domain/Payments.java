package com.libreria.donquijote.payments.domain;

import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmount;
import com.libreria.donquijote.payments.domain.validations.amount.PymentsAmountConverter;
import com.libreria.donquijote.payments.domain.validations.date_buy.PymentsDateBuy;
import com.libreria.donquijote.payments.domain.validations.date_buy.PymentsDateBuyConverter;
import com.libreria.donquijote.payments.domain.validations_partial.fullpyment.PaymentsPartialFullPyment;
import com.libreria.donquijote.payments.domain.validations_partial.fullpyment.PaymentsPartialFullPymentConverter;
import com.libreria.donquijote.payments.domain.validations.id.PymentsId;
import com.libreria.donquijote.payments.domain.validations.id.PymentsIdConverter;
import com.libreria.donquijote.payments.domain.validations.type.PymentsType;
import com.libreria.donquijote.payments.domain.validations.type.PymentsTypeConverter;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAYMENTS")
public class Payments {

    // INTERGER
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Convert(converter = PymentsIdConverter.class)
    @Column(name = "id")
    private PymentsId id;

    //LOCALDATE
    @Column(name = "date")
    @Convert(converter = PymentsDateBuyConverter.class)
    private PymentsDateBuy DateBuy;

    //FLOAT
    @Column(name = "amount")
    @Convert(converter = PymentsAmountConverter.class)
    private PymentsAmount amount;


    //STRING
    @Column(name = "type")
    @Convert(converter = PymentsTypeConverter.class)
    private PymentsType type;

    //LIST
    @OneToMany(cascade = CascadeType.ALL)
    private List<PaymentsPartial> paymentsPartialList;

}
