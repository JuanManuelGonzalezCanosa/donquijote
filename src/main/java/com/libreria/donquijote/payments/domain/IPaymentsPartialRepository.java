package com.libreria.donquijote.payments.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("ipaymentspartialrepository")
public interface IPaymentsPartialRepository extends JpaRepository <PaymentsPartial, Integer> {
}
