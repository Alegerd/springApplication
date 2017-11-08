package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Seller;

import java.util.List;

public interface ISellerSevice {
    List<Seller> getAllSellers();
    Seller getSellerById(Integer id);
}
