package com.libreria.donquijote.rentbook.infrastrcuture.db;


import com.libreria.donquijote.rentbook.domain.RentBook;
import com.libreria.donquijote.rentbook.domain.RentBookRepository;
import com.libreria.donquijote.rentbook.infrastrcuture.mapper.RentBookRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
public class PostgresRentRepository implements RentBookRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostgresRentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public void saveOrUpdate(RentBook rentBook) {

        Optional<RentBook> optionalRentBook = findById(Optional.ofNullable(rentBook.getId()).orElse(-1));
        if (optionalRentBook.isPresent()) {
            String sql = "UPDATE RENT_BOOK set age = ?" +
                    "SET BOOK_ID = ?," +
                    "CLIENT_ID = ?," +
                    "RENT_PRICE = ?," +
                    "INIT_DATE = ?," +
                    "END_DATE = ?," +
                    "RETURNED = ?" +
                    " where id = ?";
            jdbcTemplate.update(sql, rentBook.getId(), rentBook.getBookId(), rentBook.getClientId(), rentBook.getRentPrice(), rentBook.getInitDate(), rentBook.getEndDate(), rentBook.getReturned());
        } else {
            jdbcTemplate.update(
                    "INSERT INTO RENT_BOOK (BOOK_ID,CLIENT_ID,RENT_PRICE,INIT_DATE,END_DATE,RETURNED) VALUES ( ?, ?, ?, ?, ?, ?)", rentBook.getBookId(), rentBook.getClientId(), rentBook.getRentPrice(), rentBook.getInitDate(), rentBook.getEndDate(), rentBook.getReturned());
        }

    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RentBook> findById(Integer id) {
        String sql = "SELECT * FROM RENT_BOOK WHERE id = ?";
        List<RentBook> rentBookList = jdbcTemplate.query(sql, new RentBookRowMapper(), id);
        if (rentBookList.isEmpty()) return Optional.empty();
        return Optional.ofNullable(jdbcTemplate.query(sql, new RentBookRowMapper(), id).get(0));
    }

    @Override
    public Boolean isRented(Integer bookId, Integer clienteId) {
        String sql = "SELECT * FROM RENT_BOOK WHERE BOOK_ID = ?";
        List<RentBook> rentBookList = jdbcTemplate.query(sql, new RentBookRowMapper(), bookId);
        return !rentBookList.isEmpty();
    }
}
