package com.libreria.donquijote.rentbookView.infrastructure.listener;

import com.libreria.donquijote.rentbook.domain.RentBookAddeDomain;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RentBookAddedListener {

    @EventListener
    public void handler(RentBookAddeDomain event) {

        System.out.println("Auditing the event " + event.getName());
    }

}
