package com.libreria.donquijote.book.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;
import org.hibernate.annotations.Type;

@Getter
@Setter

public class ItemBook {

    protected String type;
}
