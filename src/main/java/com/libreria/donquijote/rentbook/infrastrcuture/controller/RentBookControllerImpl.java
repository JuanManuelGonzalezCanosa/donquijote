package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.libreria.donquijote.rentbook.application.IServiceRentBook;
import com.libreria.donquijote.rentbook.domain.RentBook;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class RentBookControllerImpl implements IRentBookController {

    private final IServiceRentBook service;

    public RentBookControllerImpl(IServiceRentBook service) {
        this.service = service;
    }

    @Override
    public void rent(RentBookDTO rentBookDTO) {
        service.rent(
                RentBook.builder()
                        .id(rentBookDTO.getId())
                        .clientId(rentBookDTO.getClientId())
                        .bookId(rentBookDTO.getBookId())
                        .rentPrice(100.00) //TODO: armar table book-price
                        .initDate(LocalDate.now())
                        .build()
        );
    }
}
