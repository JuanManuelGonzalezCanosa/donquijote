package com.libreria.donquijote.kernel.cqrs.interfaces;

public interface ICommandHandler<T extends ICommand> {
    void handle(T command);
}
