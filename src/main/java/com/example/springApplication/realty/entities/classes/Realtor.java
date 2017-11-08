package com.example.springApplication.realty.entities.classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Realtor")
public class Realtor implements Serializable{

    public class RealtorStruct implements Serializable{

        private Integer id;

        private String name;

        private Integer salary;

        private Integer rating;

        private Integer branchId;

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

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public Integer getBranchId() {
            return branchId;
        }

        public void setBranchId(Integer branchId) {
            this.branchId = branchId;
        }

        public RealtorStruct() {
            this.id = Realtor.this.getId();
            this.name = Realtor.this.getName();
            this.salary = Realtor.this.getSalary();
            this.rating = Realtor.this.getRating();
            this.branchId = Realtor.this.getBranch().getId();
        }
    }

    @Id
    @GeneratedValue
    @Column(name = "Realtor_ID")
    private Integer id;

    @Column(name = "Realtor_Name")
    private String name;

    @Column(name = "Salary")
    private Integer salary;

    @Column(name = "Rating")
    private Integer rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Branch", nullable = false)
    private Branch branch;

    public RealtorStruct getRealtorInformation(){
        return new RealtorStruct();
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getRating() {
        return rating;
    }
}
