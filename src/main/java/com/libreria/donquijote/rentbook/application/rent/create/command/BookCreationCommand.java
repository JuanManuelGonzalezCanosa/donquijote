package com.libreria.donquijote.rentbook.application.rent.create.command;

import com.libreria.donquijote.kernel.cqrs.interfaces.ICommand;
import com.libreria.donquijote.rentbook.domain.RentBook;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BookCreationCommand implements ICommand {

    private final Integer id;
    private final Integer bookId;
    private final Integer clientId;
    private final Double rentPrice;
    private final LocalDate initDate;
    private final LocalDate endDate;
    private final Boolean returned;

    public BookCreationCommand(Integer id, Integer bookId, Integer clientId, Double rentPrice, LocalDate initDate, LocalDate endDate, Boolean returned) {
        this.id = id;
        this.bookId = bookId;
        this.clientId = clientId;
        this.rentPrice = rentPrice;
        this.initDate = initDate;
        this.endDate = endDate;
        this.returned = returned;
    }

    public static RentBook fromCommand(BookCreationCommand command) {
        return RentBook.builder()
                .bookId(command.bookId)
                .clientId(command.clientId)
                .endDate(command.endDate)
                .initDate(command.initDate)
                .rentPrice(command.rentPrice)
                .returned(command.returned)
                .build();
    }
}
