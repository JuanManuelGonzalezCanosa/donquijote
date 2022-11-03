package com.libreria.donquijote.create.infrastructure.listener;


import com.libreria.donquijote.book.domain.BookAddeDomain;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CreateBookListener {

    @EventListener
    public void saveBookJson(BookAddeDomain event){
        //GUARDAR EN FORMATO JSON

    }
}
