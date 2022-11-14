package com.libreria.donquijote.payments.domain;

import com.libreria.donquijote.payments.domain.validations_partial.expiration_date.PaymentsPartialExpirationDate;
import com.libreria.donquijote.payments.domain.validations_partial.expiration_date.PaymentsPartialExpirationDateConverter;
import com.libreria.donquijote.payments.domain.validations_partial.fullpyment.PaymentsPartialFullPyment;
import com.libreria.donquijote.payments.domain.validations_partial.fullpyment.PaymentsPartialFullPymentConverter;
import com.libreria.donquijote.payments.domain.validations_partial.id.PaymentsPartialId;
import com.libreria.donquijote.payments.domain.validations_partial.id.PaymentsPartialIdConverter;
import com.libreria.donquijote.payments.domain.validations_partial.status.PaymentsPartialStatus;
import com.libreria.donquijote.payments.domain.validations_partial.status.PaymentsPartialStatusConverter;
import com.libreria.donquijote.payments.domain.validations_partial.surcharge_taxes.PaymentsPartialSurchargeTaxes;
import com.libreria.donquijote.payments.domain.validations_partial.surcharge_taxes.PaymentsPartialSurchargeTaxesConverter;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment_partial")
public class PaymentsPartial implements Serializable {

    //INTEGER ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Convert(converter = PaymentsPartialIdConverter.class)
    private Integer id;

    //LOCALDATE FECHA DE VENCIMIENTO
    @Column(name = "expiration_date")
    @Convert(converter = PaymentsPartialExpirationDateConverter.class)
    private PaymentsPartialExpirationDate expirationDate;

    //FLOAT IMPUESTO POR FALTA DE PAGO
    @Column(name = "surcharge_taxes")
    @Convert(converter = PaymentsPartialSurchargeTaxesConverter.class)
    private PaymentsPartialSurchargeTaxes surchargeTaxes;

    //FLOAT CUANTO PAGO DE LA COUTA
    @Column(name = "full_pyment")
    @Convert(converter = PaymentsPartialFullPymentConverter.class)
    private PaymentsPartialFullPyment fullPyment;

    //BOOLEAN SI ESTA HABILITADA LA TARJETA
    @Column(name = "status")
    @Convert(converter = PaymentsPartialStatusConverter.class)
    private PaymentsPartialStatus status;

    @ManyToOne
    //@JoinColumn(name = "id")
    private Payments payment;
}
