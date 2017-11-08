package com.example.springApplication.realty.services.classes;

import com.example.springApplication.realty.dao.classes.SellerDAO;
import com.example.springApplication.realty.entities.classes.Seller;
import com.example.springApplication.realty.services.interfaces.ISellerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("sellerService")
@Transactional
public class SellerService implements ISellerSevice {

    @Autowired
    private SellerDAO sellerDAO;

    @Override
    public List<Seller.SellerStruct> getAllSellers() {
        return sellerDAO.getAllSellers();
    }

    @Override
    public Seller getSellerById(Integer id) {
        return sellerDAO.getSellerById(id);
    }
}
