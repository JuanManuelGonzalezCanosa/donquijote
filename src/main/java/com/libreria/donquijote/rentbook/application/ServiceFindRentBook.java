package com.libreria.donquijote.rentbook.application;

import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookNotFoundException;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceFindRentBook implements IServiceRentFind {

    private final RentBookRepository rentBookRepository;

    public ServiceFindRentBook(@Qualifier("postgresBookRepository") RentBookRepository rentBookRepository) {
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
