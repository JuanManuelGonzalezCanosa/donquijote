package com.libreria.donquijote.rentbook.infrastrcuture.mapper;


import com.libreria.donquijote.rentbook.domain.RentBook;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class RentBookRowMapper implements RowMapper<RentBook> {

    @Override
    public RentBook mapRow(ResultSet rs, int rowNum) throws SQLException {

        RentBook rentBook = new RentBook();
        rentBook.setId(rs.getInt("ID"));
        rentBook.setClientId(rs.getInt("CLIENT_ID"));
        rentBook.setBookId(rs.getInt("BOOK_ID"));
        rentBook.setRentPrice(rs.getDouble("RENT_PRICE"));
        rentBook.setInitDate(toLocalDate(rs.getDate("INIT_DATE")));
        rentBook.setEndDate(toLocalDate(rs.getDate("INIT_DATE")));
        rentBook.setReturned(rs.getBoolean("RETURNED"));

        return rentBook;

    }

    private LocalDate toLocalDate(Date date) {
        return LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date));

    }
}