package com.libreria.donquijote.service;


import com.libreria.donquijote.repository.IRentBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("rentbookservice")
@Service
public class RentBookService {

    @Autowired
    private IRentBookRepository repository;
}
