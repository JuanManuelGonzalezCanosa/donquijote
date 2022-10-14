package com.libreria.donquijote.controller;


import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    private BookService service;


    @PostMapping("create")
    public ResponseEntity<?> createBook(@RequestBody Book book){
        try{
            return new ResponseEntity<>(service.createBook(book), HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @DeleteMapping("delete/{idBook}")
    public ResponseEntity<?> deleteBook(@PathVariable Integer idBook){
        try{
            return new ResponseEntity<>(service.deleteBookId(idBook), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("put/{idBook}")
    public ResponseEntity<?> putBook(@PathVariable Integer idBook, @RequestBody Book book){
        try{
            return new ResponseEntity<>(service.putBook(idBook, book), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{idBook}")
    public ResponseEntity<?> getBookId(@PathVariable Integer idBook){
        try{
            return new ResponseEntity<>(service.getBookId(idBook), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list")
    public List<Book> getBookLst(){
        return service.getBookLst();
    }

}
