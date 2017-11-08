package com.example.springApplication.realty.dao.interfaces;

import com.example.springApplication.realty.entities.classes.Realtor;

import java.util.List;

public interface IRealtorDAO {
    List<Realtor.RealtorStruct> getAllRealtors();
}
