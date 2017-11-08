package com.example.springApplication.realty.services.classes;

import com.example.springApplication.realty.dao.classes.DealDAO;
import com.example.springApplication.realty.dao.interfaces.IDealDAO;
import com.example.springApplication.realty.entities.classes.Deal;
import com.example.springApplication.realty.services.interfaces.IDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("dealService")
public class DealService implements IDealService{

    @Autowired
    private DealDAO dealDAO;

    @Override
    public List<Deal.DealStruct> getAllDeals() {
        return dealDAO.getAllDeals();
    }
}
