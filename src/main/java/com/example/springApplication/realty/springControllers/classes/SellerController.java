package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Seller;
import com.example.springApplication.realty.services.classes.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("sellers")
    public ResponseEntity<List<Seller>> getAllSellers(){
        return new ResponseEntity<>(sellerService.getAllSellers(), HttpStatus.OK);
    }

}
