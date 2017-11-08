package com.example.springApplication.realty.entities.classes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    public class CustomerStruct implements Serializable{

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getBudget() {
            return budget;
        }

        public void setBudget(Integer budget) {
            this.budget = budget;
        }

        public Integer getId() {

            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        private Integer id;

        private String name;

        private Integer budget;

        public CustomerStruct(){
            id = Customer.this.getId();
            name = Customer.this.getName();
            budget = Customer.this.getBudget();
        }
    }

    public static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Customer_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "Customer_Name")
    private String name;

    @Column(name = "Budget")
    private Integer budget;

    public CustomerStruct getCustomerInformation(){
        return new CustomerStruct();
    }

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
