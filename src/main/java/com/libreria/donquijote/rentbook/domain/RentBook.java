package com.libreria.donquijote.rentbook.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "RENT_BOOK")
public class RentBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "BOOK_ID", nullable = false)
    private Integer bookId;
    @Column(name = "CLIENT_ID", nullable = false)
    private Integer clientId;
    @Column(name = "RENT_PRICE", nullable = false)
    private Double rentPrice;
    @Column(name = "INIT_DATE", nullable = false)
    private LocalDate initDate;
    @Column(name = "END_DATE", nullable = true)
    private LocalDate endDate;
    @Column(name = "RETURNED", nullable = true, columnDefinition = "BOOLEAN default false")
    private Boolean returned;
}
