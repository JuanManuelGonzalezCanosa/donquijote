package com.libreria.donquijote.book.domain;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

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

@TypeDef(
        name = "json",
        typeClass = JsonType.class
)
public class BookLst {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

   // @Convert(converter = ItemBookConverter.class,disableConversion = true)
    @Column(columnDefinition = "json")
    @Type(type = "json")
    private List<ItemBook> books = new ArrayList<>();
}
