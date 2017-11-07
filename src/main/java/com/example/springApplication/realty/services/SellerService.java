package com.example.springApplication.realty.services;

import com.example.springApplication.realty.dao.SellerDAO;
import com.example.springApplication.realty.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SellerService implements ISellerSevice{

    @Autowired
    private SellerDAO sellerDAO;

    @Override
    public List<Seller> getAllSellers() {
        return sellerDAO.getAllSellers();
    }

    @Override
    public Seller getSellerById(Integer id) {
        return sellerDAO.getSellerById(id);
    }
}
