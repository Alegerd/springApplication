package com.example.springApplication.realty.entities.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Branch")
public class Branch implements Serializable{

    public class BranchStruct implements Serializable{

        private Integer id;

        private String adress;

        public BranchStruct() {
            this.id = Branch.this.getId();
            this.adress = Branch.this.getAdress();
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }
    }

    @Id
    @Column(name = "Branch_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "Branch_Adress")
    private String adress;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
    @ElementCollection(targetClass=Integer.class)
    private Set<Realtor> realtors;

    public BranchStruct getAllInformation(){
        return new BranchStruct();
    }

    public Set<Realtor> getRealtors() {
        return realtors;
    }

    public void setRealtors(Set<Realtor> realtors) {
        this.realtors = realtors;
    }


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
