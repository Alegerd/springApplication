package com.example.springApplication.realty.dao.interfaces;

import com.example.springApplication.realty.entities.classes.Realty;

import java.util.List;

public interface IRealtyDAO {
    List<Realty.RealtyStruct> getAllRealties();
}
