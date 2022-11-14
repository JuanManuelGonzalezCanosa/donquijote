package com.libreria.donquijote.kernel.cqrs.interfaces;

public interface IQueryGateway {
    <R> R ask(IQuery query);
}
