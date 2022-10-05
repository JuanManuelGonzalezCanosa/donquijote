package com.libreria.donquijote.repository;

import com.libreria.donquijote.entity.RentBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("rentbookrepository")
public interface IRentBookRepository extends JpaRepository<RentBook, Integer> {
}
