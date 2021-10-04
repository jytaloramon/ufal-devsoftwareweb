package com.disteoe.disteoeservice.controller;

import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@Slf4j
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public Client saveClient(@RequestBody Client client) {
        log.info("Inside saveClient method of ClientController");
        return clientService.saveClient(client);
    }

    @GetMapping("/")
    public List<Client> getAll() {
        log.info("Inside findClientBy method of ClientController");
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client findClientBy(@PathVariable("id") Long id) {
        log.info("Inside findClientBy method of ClientController");
        return clientService.findClientBy(id);
    }


}
