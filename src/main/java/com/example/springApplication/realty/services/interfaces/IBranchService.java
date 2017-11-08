package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Branch;

import java.util.List;

public interface IBranchService {
    List<Branch.BranchStruct> getAllBranches();
    Branch getBranchById(Integer id);
    boolean addBranch(Branch branch);
    void updateBranch(Branch branch);
    void deleteBranch(Integer id);
}
