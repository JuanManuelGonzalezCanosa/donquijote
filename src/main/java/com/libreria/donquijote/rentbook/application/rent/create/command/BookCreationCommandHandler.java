package com.libreria.donquijote.rentbook.application.rent.create.command;

import com.libreria.donquijote.kernel.cqrs.interfaces.ICommandHandler;
import com.libreria.donquijote.rentbook.application.rent.create.ServiceRentBookImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bookcreation")
public class BookCreationCommandHandler implements ICommandHandler<BookCreationCommand> {

    private final ServiceRentBookImpl useCase;

    public BookCreationCommandHandler(ServiceRentBookImpl useCase) {
        this.useCase = useCase;
    }

    @Override
    public void handle(BookCreationCommand command) {
        useCase.rent(command);
    }
}
