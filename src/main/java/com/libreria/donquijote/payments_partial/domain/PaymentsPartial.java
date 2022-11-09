package com.libreria.donquijote.payments_partial.domain;


import com.libreria.donquijote.payments_partial.domain.validations.return_date.PaymentsPartialReturnDate;
import com.libreria.donquijote.payments_partial.domain.validations.cant_installments.PaymentsPartialCantInstallments;
import com.libreria.donquijote.payments_partial.domain.validations.expiration_date.PaymentsPartialExpirationDate;
import com.libreria.donquijote.payments_partial.domain.validations.id.PaymentsPartialId;
import com.libreria.donquijote.payments_partial.domain.validations.status.PaymentsPartialStatus;
import com.libreria.donquijote.payments_partial.domain.validations.surcharge_taxes.PaymentsPartialSurchargeTaxes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payment_partial")
public class PaymentsPartial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private PaymentsPartialId id;

    @Column(name = "expiration_date")
    private PaymentsPartialExpirationDate expirationDate;

    @Column(name = "surcharge_taxes")
    private PaymentsPartialSurchargeTaxes surchargeTaxes;

    @Column(name = "returnDate", nullable = false)
    private PaymentsPartialReturnDate returnDate;

    @Column(name = "cant_installments")
    private PaymentsPartialCantInstallments cantInstallments;

    @Column(name = "status")
    private PaymentsPartialStatus status;
}
