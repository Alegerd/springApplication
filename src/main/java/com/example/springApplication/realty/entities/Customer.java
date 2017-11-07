package com.example.springApplication.realty.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Customer_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "Customer_Name")
    private String name;

    @Column(name = "Budget")
    private Integer budget;

    public Integer getId() {
        return id;
    }

    public Integer getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
