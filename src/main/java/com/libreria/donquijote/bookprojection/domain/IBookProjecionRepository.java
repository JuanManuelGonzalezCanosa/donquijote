package com.libreria.donquijote.bookprojection.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@Qualifier("ibookprojectionrepository")
public interface IBookProjecionRepository extends JpaRepository<BookProjection, String> {
}
