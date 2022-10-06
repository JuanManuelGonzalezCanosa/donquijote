package com.libreria.donquijote.service;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.BuyBook;
import com.libreria.donquijote.repository.IBuyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Qualifier("buybookservice")
@Service
public class BuyBookService {

    @Autowired
    private IBuyBookRepository repository;

    public BuyBook buyBook(Book book) throws Exception {
        BuyBook buyBook = new BuyBook();

        //Validamos si hay Stock y Descontamos Y Creamos la Compra del Libro
        if(book.getStock() <= 0){
            throw new Exception("Error no hay STOCK");
        }

        buyBook.setBook(book);
        buyBook.getBook().setStock(book.getStock() - 1);
        buyBook.setBuyDateBook(LocalDate.now());

        return repository.save(buyBook);
    }

    public BuyBook putBuy(BuyBook buyBook, Integer buyBookId){
        BuyBook aux = this.getBuyId(buyBookId);

        aux.setBook(buyBook.getBook());
        aux.setBuyDateBook(buyBook.getBuyDateBook());

        return aux;
    }

    public boolean deleteBuy(Integer buyBookId){
        repository.deleteById(buyBookId);
        return true;
    }

    public BuyBook getBuyId(Integer idBookId){
        return repository.findById(idBookId).get();
    }

    public List<BuyBook> getBuyLst(){return repository.findAll();}

}
