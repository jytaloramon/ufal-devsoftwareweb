package com.disteoe.disteoeservice.entity.location;

import com.disteoe.disteoeservice.entity.client.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String number;

    @Column
    private String observation;

    @ManyToOne
    @JoinColumn(name = "id_cityfk", referencedColumnName = "id", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "id_clientfk", referencedColumnName = "id", nullable = false)
    private Client client;

}
