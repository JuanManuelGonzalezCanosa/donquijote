package com.libreria.donquijote.rentbook.application;


import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookException;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;


public class ServiceRentBookImpl implements IServiceRentBook {

    private final RentBookRepository rentBookRepository;

    public ServiceRentBookImpl(RentBookRepository rentBookRepository) {
        this.rentBookRepository = rentBookRepository;
    }

    @Override
    public void rent(RentBook rentBook) {
        if (this.rentBookRepository.isRented(rentBook.getBookId(), rentBook.getClientId())) {
            throw new RentBookException("el libro ya se encuentra rentado " + rentBook.getBookId());
        } else {
            this.rentBookRepository.saveOrUpdate(rentBook);
        }
    }

    @Override
    public void back(RentBook book) {

    }


}
