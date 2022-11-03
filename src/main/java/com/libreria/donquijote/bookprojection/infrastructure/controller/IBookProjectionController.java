package com.libreria.donquijote.bookprojection.infrastructure.controller;


import com.libreria.donquijote.bookprojection.domain.BookProjection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book/")
public interface IBookProjectionController {

    @GetMapping("{id}")
    ResponseEntity<String> findById(@PathVariable("id") String id);
}
