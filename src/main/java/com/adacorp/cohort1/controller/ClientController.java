package com.adacorp.cohort1.controller;

import com.adacorp.cohort1.models.ClientModel;
import com.adacorp.cohort1.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientModel> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping
    public ClientModel addClient(@RequestBody ClientModel client){
        return clientService.addClient(client);
    }

    @GetMapping("{id}")
    public Optional<ClientModel> getClientById(@PathVariable("id") Integer id){
        return clientService.getClientById(id);
    }
}
