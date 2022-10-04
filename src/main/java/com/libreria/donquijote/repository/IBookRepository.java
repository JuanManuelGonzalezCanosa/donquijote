package com.libreria.donquijote.repository;

import com.libreria.donquijote.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookrepository")
public interface IBookRepository extends JpaRepository<Book, Integer> {
}
