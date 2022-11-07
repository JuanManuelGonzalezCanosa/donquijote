package com.libreria.donquijote.payments.domain;

import com.libreria.donquijote.payments.domain.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentsRepository extends JpaRepository<Payments, Integer> {
}
