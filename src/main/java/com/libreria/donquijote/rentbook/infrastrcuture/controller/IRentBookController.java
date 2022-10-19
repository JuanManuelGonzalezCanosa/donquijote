package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/rent")
@Validated
public interface IRentBookController {
    @PostMapping
    void rent(@RequestBody RentBookDTO rentBookDTO);
}
