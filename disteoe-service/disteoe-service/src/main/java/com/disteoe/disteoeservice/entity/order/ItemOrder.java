package com.disteoe.disteoeservice.entity.order;

import com.disteoe.disteoeservice.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_orderbuyfk", referencedColumnName = "id", nullable = false)
    private OrderBuy orderBuy;

    @ManyToOne
    @JoinColumn(name = "id_productfk", referencedColumnName = "id", nullable = false)
    private Product product;

    @Column(nullable = false)
    @ColumnDefault("1")
    private int quantity;



}
