package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Realtor;
import com.example.springApplication.realty.services.classes.RealtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class RealtorController {

    @Autowired
    private RealtorService realtorService;

    @GetMapping("realtors")
    public ResponseEntity<List<Realtor.RealtorStruct>> getAllRealtors(){
        return new ResponseEntity<List<Realtor.RealtorStruct>>(realtorService.getAllRealtors(), HttpStatus.OK);
    }

    @GetMapping("realtorPhoto/{id}")
    public ResponseEntity<String> getAllRealtors(@PathVariable Integer id){
        return new ResponseEntity<String>(realtorService.getRealtorsPhoto(id), HttpStatus.OK);
    }
}
