package com.libreria.donquijote.bookprojection.application.save;

import com.libreria.donquijote.bookprojection.domain.BookProjection;

@Service
public class BookProjectionSave implements IBookProjectionSave {

    private final IBookProjecionRepository repository;

    public BookProjectionSave(IBookProjecionRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(BookProjection bookProjection) {
        repository.save(bookProjection);
    }
}
