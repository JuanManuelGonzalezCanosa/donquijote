package com.libreria.donquijote.bookprojection.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.libreria.donquijote.book.domain.ItemBook;

import javax.persistence.AttributeConverter;
import java.util.List;

public class BookRead implements AttributeConverter<BookProjection, String> {

    private static ObjectMapper mapper;

    private String json;

    static {
        mapper = new ObjectMapper();
    }


    @Override
    public String convertToDatabaseColumn(BookProjection attribute) {
        try{
            return mapper.writeValueAsString(attribute);
        }catch (JsonProcessingException e){
            return null;
        }
    }

    @Override
    public BookProjection convertToEntityAttribute(String dbData) {
        try{
            return mapper.readValue(dbData, new TypeReference<BookProjection>() {} );
        }catch (Exception e){
            return null;
        }
    }



}
