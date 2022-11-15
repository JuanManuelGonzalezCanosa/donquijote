package com.libreria.donquijote.rentbook.application.rent.query.find_by_id;

import com.libreria.donquijote.kernel.cqrs.interfaces.IQueryHandler;
import com.libreria.donquijote.rentbook.application.rent.query.ServiceFindRentBook;
import org.springframework.stereotype.Service;

@Service
public class FindByIdQueryHandler implements IQueryHandler<FindByIdQuery, ResponseRentoBook> {

    private final ServiceFindRentBook useCase;

    public FindByIdQueryHandler(ServiceFindRentBook useCase) {
        this.useCase = useCase;
    }

    @Override
    public ResponseRentoBook ask(FindByIdQuery query) {
        return useCase.find(query);
    }
}
