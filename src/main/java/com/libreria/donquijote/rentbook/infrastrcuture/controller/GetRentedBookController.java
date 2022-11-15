package com.libreria.donquijote.rentbook.infrastrcuture.controller;

import com.libreria.donquijote.kernel.cqrs.GatewayDispatcher;
import com.libreria.donquijote.rentbook.application.rent.query.find_by_id.FindByIdQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRentedBookController implements IGetRentedBookController {

    private final GatewayDispatcher gatewayDispatcher;

    public GetRentedBookController(GatewayDispatcher gatewayDispatcher) {
        this.gatewayDispatcher = gatewayDispatcher;
    }

    @Override
    public ResponseEntity<?> rent(Integer id) {
        return
                ResponseEntity.ok(
                        gatewayDispatcher.ask(
                                new FindByIdQuery(id)
                        )
                );
    }
}
