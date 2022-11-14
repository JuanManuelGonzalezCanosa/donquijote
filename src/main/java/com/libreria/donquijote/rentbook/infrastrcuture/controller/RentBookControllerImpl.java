package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.libreria.donquijote.kernel.cqrs.GatewayDispatcher;
import com.libreria.donquijote.rentbook.application.rent.create.command.BookCreationCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class RentBookControllerImpl implements IRentBookController {

    private final GatewayDispatcher gatewayDispatcher;


    public RentBookControllerImpl(GatewayDispatcher gatewayDispatcher) {
        this.gatewayDispatcher = gatewayDispatcher;
    }

    @Override
    public ResponseEntity<?> rent(RentBookDTO rentBookDTO) {

        gatewayDispatcher.dispatch(new BookCreationCommand(
                rentBookDTO.getId(),
                rentBookDTO.getBookId(),
                rentBookDTO.getClientId(),
                100.00,
                LocalDate.now(),
                null,
                false
        ));

        return ResponseEntity.accepted().body("accepted");

    }
}
