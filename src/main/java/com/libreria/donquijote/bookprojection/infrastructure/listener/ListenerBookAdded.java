package com.libreria.donquijote.bookprojection.infrastructure.listener;

import com.libreria.donquijote.book.domain.BookAddeDomain;
import com.libreria.donquijote.bookprojection.application.save.IBookProjectionSave;
import com.libreria.donquijote.bookprojection.domain.BookProjection;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerBookAdded {

    private IBookProjectionSave projection;

    @EventListener
    public void saveProjection(BookAddeDomain bookAddeDomain) {

        //TODO: convertio a json
        String json = wrapper.toJson(bookAddeDomain);
        BookProjection bookProjection = new BookProjection(null, json)
        projection.save(json);
    }
}
