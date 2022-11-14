package com.libreria.donquijote.kernel.cqrs;

import com.libreria.donquijote.kernel.cqrs.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class GatewayDispatcher implements IQueryGateway, ICommanGateway {
    @Autowired
    ApplicationContext context;

    private static String key(Object object) {
        return Character.toLowerCase(object.getClass().getSimpleName().charAt(0)) + object.getClass().getSimpleName().substring(1) + "Handler";

    }

    @Override
    public void dispatch(ICommand command) {
        Map<String, ICommandHandler> beansList = context.getBeansOfType(ICommandHandler.class);
        ICommandHandler commandHandler = beansList.get(key(command));
        commandHandler.handle(command);
        return;
    }

    @Override
    public <R> R ask(IQuery query) {
        Map<String, IQueryHandler> beansList = context.getBeansOfType(IQueryHandler.class);
        return (R) beansList.get(key(query)).ask(query);
    }
}
