package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.libreria.donquijote.rentbook.application.IServiceRentFind;
import com.libreria.donquijote.rentbook.domain.RentBook;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRentedBookController implements IGetRentedBookController {

    private final IServiceRentFind service;

    public GetRentedBookController(IServiceRentFind service) {
        this.service = service;
    }

    @Override
    public RentBook rent(Integer id) {
        return service.find(id);
    }
}
