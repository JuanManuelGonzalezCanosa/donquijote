package com.libreria.donquijote.controller;


import com.libreria.donquijote.entity.Client;
import com.libreria.donquijote.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("create")
    public ResponseEntity<?> creteClient(@RequestBody Client client){
        try{
            return new ResponseEntity<>(service.createClient(client), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{idClient}")
    public ResponseEntity<?> getClientId(@PathVariable Integer idClient){
        try {
            return new ResponseEntity<>(service.getClientId(idClient), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list")
    public ResponseEntity<?> getClientLst(){
        try {
            return new ResponseEntity<>(service.getClientLst(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("put/{idClient}")
    public ResponseEntity<?> putClient(@PathVariable Integer idClient, @RequestBody Client client){
        try {
            return new ResponseEntity<>(service.putClient(idClient, client), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("delete/{idClient}")
    public ResponseEntity<?> deleteClient(@PathVariable Integer idClient){
        try {
            return new ResponseEntity<>(service.deleteClient(idClient), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("name/{name}")
    public ResponseEntity<?> getClientName(@PathVariable String name){
        try{
            return new ResponseEntity<>(service.getClientName(name), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("lastname/{lastName}")
    public ResponseEntity<?> getClientLastName(@PathVariable String lastName){
        try{
            return new ResponseEntity<>(service.getClientLastName(lastName), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("dni/{dni}")
    public ResponseEntity<?> getClientDni(@PathVariable Integer dni){
        try{
            return new ResponseEntity<>(service.getClientDni(dni), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
        }
    }

}
