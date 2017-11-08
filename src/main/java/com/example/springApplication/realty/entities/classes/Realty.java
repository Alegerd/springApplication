package com.example.springApplication.realty.entities.classes;

import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Realty")
public class Realty implements Serializable{

    public class RealtyStruct{

        private Integer id;

        private String type;

        private Integer seller;

        private String address;

        private Integer price;

        private Integer branch;

        public RealtyStruct() {
            this.id = Realty.this.getId();
            this.type = Realty.this.getType();
            this.seller = Realty.this.getSeller().getId();
            this.address = Realty.this.getAddress();
            this.price = Realty.this.getPrice();
            this.branch = Realty.this.getBranch().getId();
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getSeller() {
            return seller;
        }

        public void setSeller(Integer seller) {
            this.seller = seller;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getBranch() {
            return branch;
        }

        public void setBranch(Integer branch) {
            this.branch = branch;
        }
    }

    @Id
    @GeneratedValue
    @Column(name = "Realty_ID")
    private Integer id;

    @Column(name = "Type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "Seller", nullable = false)
    private Seller seller;

    @Column(name = "Realty_Adress")
    private String address;

    @Column(name = "Price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "Branch_ID", nullable = false)
    private Branch branch;

    public RealtyStruct getAllInformation(){
        return new RealtyStruct();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
