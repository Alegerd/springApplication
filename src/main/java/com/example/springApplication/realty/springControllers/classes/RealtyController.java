package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Realty;
import com.example.springApplication.realty.services.classes.RealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class RealtyController {

    @Autowired
    private RealtyService realtyService;

    @GetMapping("realties")
    public ResponseEntity<List<Realty.RealtyStruct>> getAllRealties(){
        return new ResponseEntity<List<Realty.RealtyStruct>>(realtyService.getAllRealties(), HttpStatus.OK);
    }
}
