package com.libreria.donquijote.book.infrastructure.controller.create;

import com.libreria.donquijote.book.application.abm.IBookCreateService;
import com.libreria.donquijote.book.domain.Book;
import com.libreria.donquijote.book.infrastructure.controller.BookDTO;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/book/")
@RestController
public class CreateBookController implements ICreateBookController {

    private final IBookCreateService service;

    public CreateBookController(IBookCreateService service) {
        this.service = service;
    }


    @Override
    public Book createBook(BookDTO bookDTO) {
        Book book = new Book();

        book.setId(bookDTO.getId());
        book.setNameBook(bookDTO.getNameBook());
        //book.setNameAuthor(bookDTO.getNameAuthor());
        book.setStock(bookDTO.getStock());

        return service.createBook(book);
    }
}
