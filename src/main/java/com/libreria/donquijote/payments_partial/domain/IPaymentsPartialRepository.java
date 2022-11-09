package com.libreria.donquijote.payments_partial.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentsPartialRepository extends JpaRepository <PaymentsPartial, Integer> {
}
