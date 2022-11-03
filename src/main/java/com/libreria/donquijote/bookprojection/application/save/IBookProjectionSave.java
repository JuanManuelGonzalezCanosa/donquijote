package com.libreria.donquijote.bookprojection.application.save;

import com.libreria.donquijote.bookprojection.domain.BookProjection;

public interface IBookProjectionSave {

    String findById(String id);

    BookProjection save(BookProjection bookProjection);
}
