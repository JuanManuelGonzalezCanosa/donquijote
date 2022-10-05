package com.libreria.donquijote.entity;

import com.libreria.donquijote.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "rent_book")
public class RentBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rent", nullable = false)
    private Integer idRent;

    @Column
    private LocalDate rentDateBook;

    @Column
    private LocalDate rentDateBookFinal;

    @Column
    private LocalDate returnDateBook;

    @Column
    private List<BookDto> lstRentBook;

    @Column
    private float total;

    @Column
    private float dailyBook;
}
