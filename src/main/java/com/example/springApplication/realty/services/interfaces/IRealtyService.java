package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Realty;

import java.util.List;

public interface IRealtyService {
    List<Realty.RealtyStruct> getAllRealties();
}
