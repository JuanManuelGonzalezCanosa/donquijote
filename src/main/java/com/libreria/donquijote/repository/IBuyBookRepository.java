package com.libreria.donquijote.repository;

import com.libreria.donquijote.entity.BuyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("buybookrepository")
public interface IBuyBookRepository extends JpaRepository<BuyBook, Integer> {
}
