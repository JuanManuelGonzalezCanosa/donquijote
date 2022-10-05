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
@Table(name = "buy_book")
public class BuyBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_buy", nullable = false)
    private Integer idBuy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "buy_date_book", nullable = false)
    private LocalDate buyDateBook;

    @OneToOne
    @JoinColumn(name = "buy_book_id", updatable = false, nullable = false)
    private Book buyBook;

    @Column(name = "total")
    private float total;
}
