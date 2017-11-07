package com.example.springApplication.realty.services;

import com.example.springApplication.realty.entities.Seller;

import java.util.List;

public interface ISellerSevice {
    List<Seller> getAllSellers();
    Seller getSellerById(Integer id);
}
