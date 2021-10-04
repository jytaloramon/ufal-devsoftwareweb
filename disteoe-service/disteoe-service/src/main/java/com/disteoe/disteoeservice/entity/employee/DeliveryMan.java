package com.disteoe.disteoeservice.entity.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryMan extends Employee {

    @Column(nullable = false)
    private String license;

    @Column(nullable = false)
    private double valueDay;

    @Override
    public double calcSalary() {
        return getSalary() + (20 * getValueDay());
    }
}
