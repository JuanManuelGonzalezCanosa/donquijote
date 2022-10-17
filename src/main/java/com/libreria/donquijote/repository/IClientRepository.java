package com.libreria.donquijote.repository;

import com.libreria.donquijote.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clientrepository")
public interface IClientRepository extends JpaRepository<Client, Integer> {
}
