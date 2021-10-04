package com.disteoe.disteoeservice.repository;

import com.disteoe.disteoeservice.entity.financial.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {


}
