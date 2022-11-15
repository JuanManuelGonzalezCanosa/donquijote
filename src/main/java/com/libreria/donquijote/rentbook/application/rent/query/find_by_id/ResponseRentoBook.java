package com.libreria.donquijote.rentbook.application.rent.query.find_by_id;

import com.libreria.donquijote.kernel.cqrs.interfaces.IResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ResponseRentoBook implements IResponse {

    private Integer bookId;
}
