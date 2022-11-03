package com.libreria.donquijote.bookprojection.infrastructure.controller;


import com.libreria.donquijote.book.application.create.IBookCreateService;
import com.libreria.donquijote.bookprojection.application.save.IBookProjectionSave;
import com.libreria.donquijote.bookprojection.domain.BookProjection;
import com.libreria.donquijote.bookprojection.domain.IBookProjecionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookProjectionController implements IBookProjectionController{

    private final IBookProjectionSave service;

    public BookProjectionController(IBookProjectionSave service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<String> findById(String id) {

        return new ResponseEntity<String>(service.findById(id), HttpStatus.OK);
    }
}
