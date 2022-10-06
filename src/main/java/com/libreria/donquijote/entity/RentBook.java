package com.libreria.donquijote.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "rent_book")
public class RentBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rent", nullable = false)
    private Integer idRent;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "rent_date_book")
    private LocalDate rentDateBook;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "rent_date_book_final")
    private LocalDate rentDateBookFinal;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "return_date_book")
    private LocalDate returnDateBook;

    @OneToOne
    @JoinColumn(name = "rent_book_id", updatable = false, nullable = false)
    private Book book;

    @Column(name = "daily_book")
    private float dailyBook;
}
