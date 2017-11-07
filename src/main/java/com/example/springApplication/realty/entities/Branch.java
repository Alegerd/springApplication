package com.example.springApplication.realty.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Branch")
public class Branch implements Serializable{

    @Id
    @Column(name = "Branch_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "Branch_Adress")
    private String adress;

    public Integer getId() {
        return id;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
