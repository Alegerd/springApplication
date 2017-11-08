package com.example.springApplication.realty.dao.classes;

import com.example.springApplication.realty.dao.interfaces.IRealtorDAO;
import com.example.springApplication.realty.entities.classes.Realtor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class RealtorDAO implements IRealtorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Realtor.RealtorStruct> getAllRealtors() {
        List<Realtor> realtors = (List<Realtor>)entityManager.createQuery("FROM Realtor").getResultList();
        List<Realtor.RealtorStruct> rs = new ArrayList<>();
        for (Realtor realtor :
                realtors) {
            rs.add(realtor.getRealtorInformation());
        }
        return rs;
    }
}
