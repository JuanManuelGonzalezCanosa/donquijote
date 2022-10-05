package com.libreria.donquijote.dto;

import com.libreria.donquijote.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import javax.persistence.Id;


@AllArgsConstructor
@Data
public class BookDto {

    @Id
    public Integer idBookDto;

    public String nameBook;

    public String nameAuthor;

    public float price;


    private TypeMap<Book, BookDto> bookDto;
    private ModelMapper modelMapper = new ModelMapper();

    public BookDto(){
        bookDto = modelMapper.createTypeMap(Book.class, BookDto.class);
        bookDto.addMappings(mapping -> mapping.map(book -> book.getNameBook(), BookDto :: setNameBook));
        bookDto.addMappings(mapping -> mapping.map(book -> book.getNameAuthor(), BookDto :: setNameAuthor));
        bookDto.addMappings(mapping -> mapping.map(book -> book.getPrice(), BookDto :: setPrice));
    }






}
