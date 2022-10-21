package com.libreria.donquijote.rentbook.application.rent;


import com.libreria.donquijote.rentbook.domain.RentBook;

public interface IServiceRentBook {

    void rent(RentBook rentBook);

    void back(RentBook rentBook);
}
