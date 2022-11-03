package com.libreria.donquijote.book.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("ibookrepository")
public interface IBookRepository extends JpaRepository<Book, Integer> {
}

