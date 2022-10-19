package com.libreria.donquijote.rentbook.application;

import com.libreria.donquijote.rentbook.domain.RentBook;

public interface IServiceRentFind {

    RentBook find(Integer id);
}
