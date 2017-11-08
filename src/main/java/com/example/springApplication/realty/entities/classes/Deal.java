package com.example.springApplication.realty.entities.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Deal")
public class Deal implements Serializable{

    public class DealStruct{

        private Integer id;

        private Integer realtor;

        private Integer customer;

        private Integer seller;

        private Integer realty;

        public DealStruct() {
            this.id = Deal.this.getId();
            this.realtor = Deal.this.getRealtor().getId();
            this.customer = Deal.this.getCustomer().getId();
            this.seller = Deal.this.getSeller().getId();
            this.realty = Deal.this.getRealty().getRating();
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getRealtor() {
            return realtor;
        }

        public void setRealtor(Integer realtor) {
            this.realtor = realtor;
        }

        public Integer getCustomer() {
            return customer;
        }

        public void setCustomer(Integer customer) {
            this.customer = customer;
        }

        public Integer getSeller() {
            return seller;
        }

        public void setSeller(Integer seller) {
            this.seller = seller;
        }

        public Integer getRealty() {
            return realty;
        }

        public void setRealty(Integer realty) {
            this.realty = realty;
        }
    }

    @Id
    @GeneratedValue
    @Column(name = "Deal_ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Realtor_ID", nullable = false)
    private Realtor realtor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer_ID", nullable = false)
    private Realtor customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Seller_ID", nullable = false)
    private Realtor seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Realty_ID", nullable = false)
    private Realtor realty;

    public DealStruct getAllInfornation(){
        return new DealStruct();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Realtor getRealtor() {
        return realtor;
    }

    public void setRealtor(Realtor realtor) {
        this.realtor = realtor;
    }

    public Realtor getCustomer() {
        return customer;
    }

    public void setCustomer(Realtor customer) {
        this.customer = customer;
    }

    public Realtor getSeller() {
        return seller;
    }

    public void setSeller(Realtor seller) {
        this.seller = seller;
    }

    public Realtor getRealty() {
        return realty;
    }

    public void setRealty(Realtor realty) {
        this.realty = realty;
    }
}
