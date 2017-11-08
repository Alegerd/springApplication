package com.example.springApplication.realty.dao.classes;

import com.example.springApplication.realty.dao.interfaces.IRealtyDAO;
import com.example.springApplication.realty.entities.classes.Realty;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class RealtyDAO implements IRealtyDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Realty.RealtyStruct> getAllRealties() {
        List<Realty> realties = (List<Realty>)entityManager.createQuery("FROM Realty").getResultList();
        List<Realty.RealtyStruct> rs = new ArrayList<>();
        for (Realty realty :
                realties) {
            rs.add(realty.getAllInformation());
        }
        return rs;
    }
}
