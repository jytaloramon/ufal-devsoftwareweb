package com.disteoe.disteoeservice.entity.client;

import com.disteoe.disteoeservice.entity.financial.CreditCard;
import com.disteoe.disteoeservice.entity.location.Address;
import com.disteoe.disteoeservice.entity.personal.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends People {

    @Column(nullable = false, unique = true, length = 32)
    private String login;

    @Column(nullable = false, unique = true, length = 32)
    private String password;

    @Column(nullable = false)
    @ColumnDefault("0")
    private double score;

    @OneToMany
    @JoinColumn(nullable = false)
    private List<CreditCard> creditCard;

    @OneToOne
    @JoinColumn(nullable = false)
    private Address address;

}
