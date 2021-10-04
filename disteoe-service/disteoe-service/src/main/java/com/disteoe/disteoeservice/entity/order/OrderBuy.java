package com.disteoe.disteoeservice.entity.order;


import com.disteoe.disteoeservice.entity.client.Client;
import com.disteoe.disteoeservice.entity.employee.DeliveryMan;
import com.disteoe.disteoeservice.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBuy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_clientfk", referencedColumnName = "id", nullable = false)
    private Client client;

    @Column(nullable = false)
    @ColumnDefault("1")
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "id_deliverymanfk", referencedColumnName = "id", nullable = false)
    private DeliveryMan deliveryMan;

    @OneToMany(mappedBy = "orderbuy")
    private List<ItemOrder> itemOrders;

}
