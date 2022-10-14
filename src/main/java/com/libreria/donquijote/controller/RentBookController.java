package com.libreria.donquijote.controller;


import com.libreria.donquijote.dto.ReturnDateBookRent;
import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.RentBook;
import com.libreria.donquijote.service.RentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book/rent/")
public class RentBookController {

    @Autowired
    private RentBookService service;

    private RestTemplate restTemplate;

    @Autowired
    public RentBookController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    @PostMapping("{rentBookid}")
    public ResponseEntity<?> rentBook(@PathVariable Integer rentBookid) {
        try {
            ResponseEntity<Book> response = restTemplate.getForEntity("http://localhost:8080/book/" + rentBookid.toString(), Book.class);
            Book book = response.getBody();

            return new ResponseEntity<>(service.rentBook(book), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<RentBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("delete/{idRentBook}")
    public ResponseEntity<?> deleteRentBook(@PathVariable Integer idRentBook) {
        try {
            return new ResponseEntity<>(service.deleteRent(idRentBook), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<RentBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("id/{idRentBook}")
    public ResponseEntity<?> getRentId(@PathVariable Integer idRentBook) {
        try {
            return new ResponseEntity<>(service.getRentId(idRentBook), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<RentBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list")
    public ResponseEntity<?> getRentLst() {
        try {
            return new ResponseEntity<>(service.getRentLst(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<RentBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("return/{idBookRent}")
    public ResponseEntity<?> returnRent(@PathVariable Integer idBookRent, @RequestBody ReturnDateBookRent returnDateBook)throws Exception{
        //try {
            return new ResponseEntity<>(service.returnDate(idBookRent, returnDateBook), HttpStatus.OK);
        //} catch (Exception e) {
        //    return new ResponseEntity<RentBook>(HttpStatus.BAD_REQUEST);
        //}
    }

}

