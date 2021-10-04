package com.disteoe.disteoeservice.entity.financial;

import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.entity.personal.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

    @Id
    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private Date expirationDate;

    @Column(nullable = false)
    private String operator;

    @Column(nullable = false)
    private String cardHolderName;

    @ManyToOne
    @JoinColumn(name = "id_clientfk", referencedColumnName = "id", nullable = false)
    private Client client;
}
