package com.example.springApplication.realty.dao;

import com.example.springApplication.realty.entities.Seller;

import java.util.List;

public interface ISellerDAO {
    List<Seller> getAllSellers();
    Seller getSellerById(Integer id);
}
