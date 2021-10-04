package com.disteoe.disteoeservice.entity.product;

import com.disteoe.disteoeservice.entity.order.ItemOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private int quantityStock;

    @OneToMany(mappedBy = "product")
    private List<ItemOrder> itemOrders;
}
