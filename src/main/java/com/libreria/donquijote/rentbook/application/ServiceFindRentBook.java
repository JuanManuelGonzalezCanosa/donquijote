package com.libreria.donquijote.rentbook.application;

import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookNotFoundException;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import lombok.SneakyThrows;

import java.util.Optional;

public class ServiceFindRentBook implements IServiceRentFind {

    private final RentBookRepository rentBookRepository;

    public ServiceFindRentBook(RentBookRepository rentBookRepository) {
        this.rentBookRepository = rentBookRepository;
    }

    @SneakyThrows
    @Override
    public RentBook find(Integer id) {
        Optional<RentBook> optionalRentBook = rentBookRepository.findById(id);
        if (!optionalRentBook.isPresent()) throw new RentBookNotFoundException("el libro no esta presente");
        return optionalRentBook.get();

    }
}
