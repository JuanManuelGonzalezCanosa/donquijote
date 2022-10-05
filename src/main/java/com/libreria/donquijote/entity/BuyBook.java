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
@Table(name = "buy_book")
public class BuyBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_buy", nullable = false)
    private Integer idBuy;

    @Column
    private LocalDate buyDateBook;

    @Column
    private List<BookDto> lstBuyBook;

    @Column
    private float total;
}
