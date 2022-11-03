package com.libreria.donquijote.bookprojection.infrastructure.listener;

import com.google.gson.Gson;
import com.libreria.donquijote.book.domain.BookAddeDomain;
import com.libreria.donquijote.bookprojection.application.save.IBookProjectionSave;
import com.libreria.donquijote.bookprojection.domain.BookProjection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class ListenerBookAdded {

    private final IBookProjectionSave projection;

    public ListenerBookAdded(@Qualifier("serviceProjection") IBookProjectionSave projection) {
        this.projection = projection;
    }

    @EventListener
    public void saveProjection(BookAddeDomain bookAddeDomain) {

        //TODO: convertio a json

        Gson gson = new Gson();

        //String json = wrapper.toJson(bookAddeDomain);

        String json = gson.toJson(bookAddeDomain);

        BookProjection bookProjection = new BookProjection(bookAddeDomain.getId(), json);



        projection.save(bookProjection);
    }
}
