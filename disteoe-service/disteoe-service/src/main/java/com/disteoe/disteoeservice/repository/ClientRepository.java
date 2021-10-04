package com.disteoe.disteoeservice.repository;

import com.disteoe.disteoeservice.entity.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    public Client findClientById(Long id);

}
