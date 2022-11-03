package com.libreria.donquijote.book.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = false)
@Entity
@Table(name = "book_lst")
public class BookLst {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Convert(converter = ItemBookConverter.class)
    @Column(columnDefinition = "json")
    private List<ItemBook> books = new ArrayList<>();
}
