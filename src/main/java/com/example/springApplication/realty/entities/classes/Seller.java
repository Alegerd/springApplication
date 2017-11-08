package com.example.springApplication.realty.entities.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Seller")
public class Seller implements Serializable{

    public class SellerStruct{

        private Integer id;

        private String name;

        public SellerStruct() {
            this.id = Seller.this.getId();
            this.name = Seller.this.getName();
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Id
    @GeneratedValue
    @Column(name = "Seller_ID")
    private Integer id;

    @Column(name = "Seller_Name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
    @ElementCollection(targetClass=Integer.class)
    private Set<Realty> realties;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
    @ElementCollection(targetClass=Integer.class)
    private Set<Deal> deals;

    public SellerStruct getAllInformation(){
        return new SellerStruct();
    }

    public Set<Deal> getDeals() {
        return deals;
    }

    public void setDeals(Set<Deal> deals) {
        this.deals = deals;
    }

    public Set<Realty> getRealties() {
        return realties;
    }

    public void setRealties(Set<Realty> realties) {
        this.realties = realties;
    }

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
