package com.libreria.donquijote.service;

import com.libreria.donquijote.entity.Client;
import com.libreria.donquijote.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("clientservice")
@Service
public class ClientService {

    @Autowired
    private IClientRepository repository;

    public Client getClientId(Integer id){
        return repository.findById(id).get();
    }

    public List<Client> getClientLst(){
        return repository.findAll();
    }

    public Client createClient(Client client){
        return repository.save(client);
    }

    public Client putClient(Integer id, Client client){
        Client aux = this.getClientId(id);

        aux.setName(client.getName());
        aux.setLastName(client.getLastName());
        aux.setDni(client.getDni());

        return repository.save(aux);
    }

    public boolean deleteClient(Integer id){
        repository.deleteById(id);

        return true;
    }
}
