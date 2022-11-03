package com.libreria.donquijote.bookprojection.application.save;

import com.libreria.donquijote.bookprojection.domain.BookProjection;
import com.libreria.donquijote.bookprojection.domain.IBookProjecionRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("serviceProjection")
public class BookProjectionSave implements IBookProjectionSave {

    private final IBookProjecionRepository repository;

    public BookProjectionSave(@Qualifier("ibookprojectionrepository") IBookProjecionRepository repository) {
        this.repository = repository;
    }

    @Override
    public String findById(String id) {

        Optional<BookProjection> aux = repository.findById(id);

        return aux.get().getData();
    }

    @Override
    public BookProjection save(BookProjection bookProjection) {
        return repository.save(bookProjection);
    }
}
