package com.example.springApplication.realty.dao.classes;

import com.example.springApplication.realty.dao.interfaces.ISellerDAO;
import com.example.springApplication.realty.entities.classes.Seller;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class SellerDAO implements ISellerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Seller.SellerStruct> getAllSellers() {
        List<Seller> sellers = (List<Seller>)entityManager.createQuery("FROM Seller").getResultList();
        List<Seller.SellerStruct> ss = new ArrayList<>();
        for (Seller seller :
                sellers) {
            ss.add(seller.getAllInformation());
        }
        return ss;
    }

    @Override
    public Seller getSellerById(Integer id) {
        return entityManager.find(Seller.class, id);
    }
}
