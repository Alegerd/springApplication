package com.example.springApplication.realty.dao.classes;

import com.example.springApplication.realty.dao.interfaces.IDealDAO;
import com.example.springApplication.realty.entities.classes.Deal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class DealDAO implements IDealDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Deal.DealStruct> getAllDeals() {
        List<Deal> deals = (List<Deal>)entityManager.createQuery("FROM Deal").getResultList();
        List<Deal.DealStruct> ds = new ArrayList<>();
        for (Deal deal :
                deals) {
            ds.add(deal.getAllInfornation());
        }
        return ds;
    }
}
