package com.example.springApplication.realty.services.classes;

import com.example.springApplication.realty.dao.classes.RealtorDAO;
import com.example.springApplication.realty.entities.classes.Realtor;
import com.example.springApplication.realty.services.interfaces.IRealtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("realtorService")
public class RealtorService implements IRealtorService {

    @Autowired
    private RealtorDAO realtorDAO;

    @Override
    public List<Realtor.RealtorStruct> getAllRealtors() {
        return realtorDAO.getAllRealtors();
    }

    public String getRealtorsPhoto(Integer id){
        return realtorDAO.getRealtorsPhoto(id);
    }
}
