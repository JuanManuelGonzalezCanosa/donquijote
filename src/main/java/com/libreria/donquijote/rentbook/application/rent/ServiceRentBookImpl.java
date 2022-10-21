package com.libreria.donquijote.rentbook.application.rent;


import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookAddeDomain;
import com.libreria.donquijote.rentbook.domain.RentBookException;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import org.springframework.context.ApplicationEventPublisher;


public class ServiceRentBookImpl implements IServiceRentBook {

    private final RentBookRepository rentBookRepository;
    private final ApplicationEventPublisher enventBus;

    public ServiceRentBookImpl(RentBookRepository rentBookRepository, ApplicationEventPublisher enventBus) {
        this.rentBookRepository = rentBookRepository;
        this.enventBus = enventBus;
    }

    @Override
    public void rent(RentBook rentBook) {
        if (this.rentBookRepository.isRented(rentBook.getBookId(), rentBook.getClientId())) {
            throw new RentBookException("el libro ya se encuentra rentado " + rentBook.getBookId());
        }
        this.rentBookRepository.saveOrUpdate(rentBook);
        this.enventBus.publishEvent(new RentBookAddeDomain(rentBook.getId(),
                rentBook.getBookId(),
                rentBook.getClientId(),
                rentBook.getRentPrice(),
                rentBook.getInitDate(),
                rentBook.getEndDate(),
                rentBook.getReturned()));
    }

    @Override
    public void back(RentBook book) {

    }


}
