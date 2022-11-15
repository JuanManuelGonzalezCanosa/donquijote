package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/v1/rent")
@Validated
public interface IGetRentedBookController {
    @GetMapping("{id}")
    ResponseEntity<?> rent(@PathVariable Integer id);
}
