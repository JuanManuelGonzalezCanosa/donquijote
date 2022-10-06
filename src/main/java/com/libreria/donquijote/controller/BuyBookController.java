package com.libreria.donquijote.controller;


import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.BuyBook;
import com.libreria.donquijote.service.BuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book/buy/")
public class BuyBookController {

    @Autowired
    private BuyBookService service;

    private RestTemplate restTemplate;

    @Autowired
    public BuyBookController(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }


    @PostMapping("{idBook}")
    public ResponseEntity<?> buyBook(@PathVariable Integer idBook) throws Exception {
        try{
            ResponseEntity<Book> response = restTemplate.getForEntity("http://localhost:8080/book/" + idBook.toString(), Book.class);

            Book book = response.getBody();

            return new ResponseEntity<BuyBook>(service.buyBook(book) , HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<BuyBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("delete/{idBuyBook}")
    public ResponseEntity<?> deleteBuyBook(@PathVariable Integer idBuyBook){
        try{
            return new ResponseEntity<>(service.deleteBuy(idBuyBook), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<BuyBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("id/{idBuyBook}")
    public ResponseEntity<?> getBuyId(@PathVariable Integer idBuyBook){
        try{
            return new ResponseEntity<>(service.getBuyId(idBuyBook), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<BuyBook>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list")
    public ResponseEntity<?> getBuyLst(){
        try{
            return new ResponseEntity<>(service.getBuyLst(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<BuyBook>(HttpStatus.BAD_REQUEST);
        }
    }


    }





