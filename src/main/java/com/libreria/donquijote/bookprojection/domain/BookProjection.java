package com.libreria.donquijote.bookprojection.domain;

import com.libreria.donquijote.book.domain.ItemBookConverter;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "BOOKPROJECTION")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class BookProjection implements Serializable {

    @Id
    private String Id;

    @Column(columnDefinition = "JSON")
    private String data;


}