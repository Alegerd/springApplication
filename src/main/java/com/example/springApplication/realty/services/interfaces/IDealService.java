package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Deal;

import java.util.List;

public interface IDealService {
    List<Deal.DealStruct> getAllDeals();
}
