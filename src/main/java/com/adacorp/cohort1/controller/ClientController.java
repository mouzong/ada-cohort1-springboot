package com.adacorp.cohort1.controller;

import com.adacorp.cohort1.models.ClientModel;
import com.adacorp.cohort1.services.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients/")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

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

    @PutMapping("{id}")
    public ClientModel editClient(@PathVariable("id") Integer id, @RequestBody ClientModel clientAModifier){
        return clientService.editClient(id,clientAModifier);
    }

    @DeleteMapping("{id}")
    public void deleteCLient(@PathVariable("id") Integer id){
        clientService.deleteClient(id);
    }










}
