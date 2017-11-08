package com.example.springApplication.realty.dao.interfaces;

import com.example.springApplication.realty.entities.classes.Seller;

import java.util.List;

public interface ISellerDAO {
    List<Seller.SellerStruct> getAllSellers();
    Seller getSellerById(Integer id);
}
