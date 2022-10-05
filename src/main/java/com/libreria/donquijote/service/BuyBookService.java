package com.libreria.donquijote.service;

import com.libreria.donquijote.repository.IBuyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("buybookservice")
@Service
public class BuyBookService {

    @Autowired
    private IBuyBookRepository repository;
}
