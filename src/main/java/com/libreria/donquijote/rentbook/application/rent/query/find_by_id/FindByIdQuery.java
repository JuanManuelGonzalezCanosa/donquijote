package com.libreria.donquijote.rentbook.application.rent.query.find_by_id;

import com.libreria.donquijote.kernel.cqrs.interfaces.IQuery;
import lombok.Getter;

@Getter
public class FindByIdQuery implements IQuery {

    private final Integer criteria;

    public FindByIdQuery(Integer criteria) {
        this.criteria = criteria;
    }
}
