package com.disteoe.disteoeservice.service;

import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.entity.financial.CreditCard;
import com.disteoe.disteoeservice.repository.CreditCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public CreditCard saveCreditCard(CreditCard creditCard) {
        log.info("Inside saveClient method of ClientService");
        return creditCardRepository.save(creditCard);
    }

    public List<CreditCard> getAll() {
        log.info("Inside getAll method of ClientService");
        return creditCardRepository.findAll();
    }

}
