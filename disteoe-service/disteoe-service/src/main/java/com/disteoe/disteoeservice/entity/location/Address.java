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

    @JoinColumn
    @ManyToOne
    private City city;

}
