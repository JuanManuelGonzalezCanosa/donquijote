package com.libreria.donquijote.rentbook.domain;

import java.util.Optional;

public interface RentBookRepository {

    Optional<RentBook> findById(Integer id);

    void saveOrUpdate(RentBook rentBook);

    Boolean isRented(Integer bookId, Integer clienteId);

}
