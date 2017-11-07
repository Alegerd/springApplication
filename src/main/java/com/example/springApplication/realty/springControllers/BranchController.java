package com.example.springApplication.realty.springControllers;

import com.example.springApplication.realty.entities.Branch;
import com.example.springApplication.realty.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("branches")
    public ResponseEntity<List<Branch>> getAllBranches(){
        return new ResponseEntity<List<Branch>>(branchService.getAllBranches(), HttpStatus.OK);
    }

    // TODO: 07.11.2017 реализовать остальные методы контроллера
}
