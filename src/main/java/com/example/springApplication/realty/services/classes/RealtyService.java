package com.example.springApplication.realty.services.classes;

import com.example.springApplication.realty.dao.classes.RealtyDAO;
import com.example.springApplication.realty.entities.classes.Realty;
import com.example.springApplication.realty.services.interfaces.IRealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("realtyService")
public class RealtyService implements IRealtyService{

    @Autowired
    private RealtyDAO realtyDAO;

    @Override
    public List<Realty.RealtyStruct> getAllRealties() {
        return realtyDAO.getAllRealties();
    }
}
