package com.libreria.donquijote.proxy;

import com.libreria.donquijote.entity.Client;

public class ClientProxy implements IClientProxy {

    private final Client client;

    public ClientProxy(Client client) {
        this.client = client;
    }


    @Override
    public void putCLient(Client client) {

    }
}
