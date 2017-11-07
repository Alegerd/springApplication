package com.example.springApplication.realty.dao;

import com.example.springApplication.realty.entities.Seller;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class SellerDAO implements ISellerDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Seller> getAllSellers() {
        return entityManager.createQuery("FROM Seller").getResultList();
    }

    @Override
    public Seller getSellerById(Integer id) {
        return entityManager.find(Seller.class, id);
    }
}
