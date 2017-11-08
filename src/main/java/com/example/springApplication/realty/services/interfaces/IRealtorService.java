package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Realtor;

import java.util.List;

public interface IRealtorService {
    List<Realtor.RealtorStruct> getAllRealtors();
}
