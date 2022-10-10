package com.libreria.donquijote.service;

import com.libreria.donquijote.entity.Book;
import com.libreria.donquijote.entity.BuyBook;
import com.libreria.donquijote.proxy.BuyProxy;
import com.libreria.donquijote.repository.IBookRepository;
import com.libreria.donquijote.repository.IBuyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("buybookservice")
@Service
public class BuyBookService {

    @Autowired
    private IBuyBookRepository repository;

    @Autowired
    private IBookRepository repositoryBook;

    public BuyBook buyBook(Book book) throws Exception {
        BuyBook buyBook = new BuyBook();
        BuyProxy buyProxy = new BuyProxy(buyBook);

        buyProxy.validateStock(buyBook, book);

        repositoryBook.save(book);
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
