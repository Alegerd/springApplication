package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Deal;
import com.example.springApplication.realty.services.classes.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class DealController {
    @Autowired
    private DealService dealService;

    @GetMapping("deals")
    public ResponseEntity<List<Deal.DealStruct>> getAllDeals(){
        return new ResponseEntity<List<Deal.DealStruct>>(dealService.getAllDeals(), HttpStatus.OK);
    }
}
