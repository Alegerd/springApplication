package com.example.springApplication.realty.dao.interfaces;

import com.example.springApplication.realty.entities.classes.Deal;

import java.util.List;

public interface IDealDAO {
    List<Deal.DealStruct> getAllDeals();
}
