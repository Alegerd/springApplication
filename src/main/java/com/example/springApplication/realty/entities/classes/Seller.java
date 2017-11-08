package com.example.springApplication.realty.entities.classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Seller")
public class Seller implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "Seller_ID")
    private Integer id;

    @Column(name = "Seller_Name")
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
