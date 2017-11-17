package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.services.classes.BranchService;
import com.example.springApplication.realty.services.classes.RealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user")
public class BranchesLinkController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private RealtyService realtyService;

    @GetMapping("realtorsInBranch/{id}")
    public ResponseEntity<List<String>> getAllRealtorsInBranch(@PathVariable Integer id){
        return new ResponseEntity<List<String>>(branchService.getAllRealtors(id), HttpStatus.OK);
    }
}
