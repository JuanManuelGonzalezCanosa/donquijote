package com.libreria.donquijote.rentbook.application.rent.create;


import com.libreria.donquijote.rentbook.application.rent.create.command.BookCreationCommand;
import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookAddeDomain;
import com.libreria.donquijote.rentbook.domain.RentBookException;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ServiceRentBookImpl {

    private final RentBookRepository rentBookRepository;
    private final ApplicationEventPublisher enventBus;

    public ServiceRentBookImpl(@Qualifier("postgresBookRepository") RentBookRepository rentBookRepository, ApplicationEventPublisher enventBus) {
        this.rentBookRepository = rentBookRepository;
        this.enventBus = enventBus;
    }

    public void rent(BookCreationCommand command) {
        if (this.rentBookRepository.isRented(command.getBookId(), command.getClientId())) {
            throw new RentBookException("el libro ya se encuentra rentado " + command.getBookId());
        }
        RentBook rentBook = BookCreationCommand.fromCommand(command);
        this.rentBookRepository.saveOrUpdate(rentBook);
        this.enventBus.publishEvent(new RentBookAddeDomain(rentBook.getId(),
                rentBook.getBookId(),
                rentBook.getClientId(),
                rentBook.getRentPrice(),
                rentBook.getInitDate(),
                rentBook.getEndDate(),
                rentBook.getReturned()));
    }



}
