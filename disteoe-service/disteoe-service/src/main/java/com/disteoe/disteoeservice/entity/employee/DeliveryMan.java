package com.disteoe.disteoeservice.entity.employee;

import com.disteoe.disteoeservice.entity.order.OrderBuy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryMan extends Employee {

    @Column(nullable = false)
    private String license;

    @Column(nullable = false)
    private double valueDay;

    @OneToMany(mappedBy = "deliveryman")
    private List<OrderBuy> orderBuys;

    @Override
    public double calcSalary() {
        return getSalary() + (20 * getValueDay());
    }
}
