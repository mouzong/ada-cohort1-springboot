package com.adacorp.cohort1.services;

import com.adacorp.cohort1.models.ClientModel;
import com.adacorp.cohort1.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<ClientModel> getClientById(Integer id) {

        return clientRepository.findById(id);
    }

    public ClientModel editClient(Integer id, ClientModel clientAModifier) {
        Optional<ClientModel> client = clientRepository.findById(id);

//        client.get()
//                .builder()
//                .nom(clientAModifier.getNom())
//                .prenom(clientAModifier.getPrenom())
//                .build();
        client.get()
                .setNom(clientAModifier.getNom());
        client.get().setPrenom(clientAModifier.getPrenom());

        clientRepository.save(client.get());

        return client.get();

    }

    public void deleteClient(Integer id) {
        Optional<ClientModel> client = clientRepository.findById(id);
        clientRepository.deleteById(id);

    }
}
