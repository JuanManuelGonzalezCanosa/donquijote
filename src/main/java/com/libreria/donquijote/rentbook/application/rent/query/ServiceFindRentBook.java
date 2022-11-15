package com.libreria.donquijote.rentbook.application.rent.query;

import com.libreria.donquijote.rentbook.application.rent.query.find_by_id.FindByIdQuery;
import com.libreria.donquijote.rentbook.application.rent.query.find_by_id.ResponseRentoBook;
import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceFindRentBook {

    private final RentBookRepository rentBookRepository;

    public ServiceFindRentBook(@Qualifier("postgresBookRepository") RentBookRepository rentBookRepository) {
        this.rentBookRepository = rentBookRepository;
    }

    public ResponseRentoBook find(FindByIdQuery query) {
        Optional<RentBook> rentBook = rentBookRepository.findById(query.getCriteria());
        if (!rentBook.isPresent()) throw new RuntimeException("no exitste");
        return ResponseRentoBook
                .builder()
                .bookId(rentBook.get().getBookId())
                .build();

    }
}
