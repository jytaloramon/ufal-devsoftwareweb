package com.disteoe.disteoeservice.controller;

import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.entity.financial.CreditCard;
import com.disteoe.disteoeservice.service.CreditCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/credit")
@Slf4j
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @PostMapping("/")
    public CreditCard saveCreditCard(@RequestBody CreditCard creditCard) {
        log.info("Inside saveClient method of ClientController");

        return creditCardService.saveCreditCard(creditCard);
    }

    @GetMapping("/")
    public List<CreditCard> getAll() {
        log.info("Inside findClientBy method of ClientController");
        return creditCardService.getAll();
    }

}
