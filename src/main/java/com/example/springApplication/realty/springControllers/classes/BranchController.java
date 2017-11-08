package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Branch;
import com.example.springApplication.realty.services.classes.BranchService;
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
    public ResponseEntity<List<Branch.BranchStruct>> getAllBranches(){
        return new ResponseEntity<List<Branch.BranchStruct>>(branchService.getAllBranches(), HttpStatus.OK);
    }

    // TODO: 07.11.2017 реализовать остальные методы контроллера
}
