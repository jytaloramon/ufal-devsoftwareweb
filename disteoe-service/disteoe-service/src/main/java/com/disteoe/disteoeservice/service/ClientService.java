package com.disteoe.disteoeservice.service;

import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        log.info("Inside saveClient method of ClientService");
        return clientRepository.save(client);
    }

    public Client findClientBy(Long id) {
        log.info("Inside findClientBy method of ClientService");
        return clientRepository.findClientById(id);
    }

    public List<Client> getAll() {
        log.info("Inside getAll method of ClientService");
        return clientRepository.findAll();
    }

}
