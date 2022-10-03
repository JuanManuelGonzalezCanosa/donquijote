package com.libreria.donquijote.service;


import com.libreria.donquijote.repository.IBook;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("bookservice")
@Service
public class BookService {

    private IBook repository;


}
