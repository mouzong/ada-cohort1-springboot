package com.adacorp.cohort1.services;

import com.adacorp.cohort1.models.ClientModel;
import com.adacorp.cohort1.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients() {

        return clientRepository.findAll();
    }

    public ClientModel addClient(ClientModel client) {

        clientRepository.save(client);
        return client;
    }
}
