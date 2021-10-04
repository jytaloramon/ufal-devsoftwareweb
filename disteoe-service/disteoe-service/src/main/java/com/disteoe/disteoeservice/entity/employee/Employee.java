package com.disteoe.disteoeservice.entity.employee;

import com.disteoe.disteoeservice.entity.personal.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee extends People {

    @Column(nullable = false)
    private String employeeNumber;

    @Column(nullable = false)
    private double salary;

    public abstract double calcSalary();
}
