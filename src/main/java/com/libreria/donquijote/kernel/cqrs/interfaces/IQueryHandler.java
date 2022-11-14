package com.libreria.donquijote.kernel.cqrs.interfaces;

public interface IQueryHandler<Q extends IQuery, R extends IResponse> {
    R ask(Q query);
}
