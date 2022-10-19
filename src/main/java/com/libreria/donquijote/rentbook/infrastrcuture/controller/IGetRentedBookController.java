package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.libreria.donquijote.rentbook.domain.RentBook;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/v1/rent")
@Validated
public interface IGetRentedBookController {
    @GetMapping("{id}")
    RentBook rent(@PathVariable Integer id);
}
