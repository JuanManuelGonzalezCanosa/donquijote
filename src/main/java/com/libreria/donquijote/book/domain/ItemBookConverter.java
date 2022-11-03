package com.libreria.donquijote.book.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.lang.reflect.Type;
import java.util.List;

public class ItemBookConverter implements AttributeConverter<List<ItemBook>, String> {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    @Override
    public String convertToDatabaseColumn(List<ItemBook> attribute) {
        try{
            return mapper.writeValueAsString(attribute);
        }catch (JsonProcessingException e){
            return null;
        }
    }

    @Override
    public List<ItemBook> convertToEntityAttribute(String dbData) {
        try{
            return mapper.readValue(dbData, new TypeReference<List<ItemBook>>() {} );
        }catch (Exception e){
            return null;
        }
    }
}
