package com.disteoe.disteoeservice.entity.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityWay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @OneToOne
    @JoinColumn(nullable = false)
    private City origem;

    @OneToOne
    @JoinColumn(nullable = false)
    private City finalWay;

    @Column(nullable = false)
    private int distance;

    @Column(nullable = false)
    private int timePerc;


}
