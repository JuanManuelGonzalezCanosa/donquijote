package com.libreria.donquijote.rentbook.domain;

public class RentBookNotFoundException extends Throwable {
    public RentBookNotFoundException(String message) {
        super(message);
    }
}
