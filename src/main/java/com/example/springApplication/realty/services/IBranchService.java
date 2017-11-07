package com.example.springApplication.realty.services;

import com.example.springApplication.realty.entities.Branch;

import java.util.List;

public interface IBranchService {
    List<Branch> getAllBranches();
    Branch getBranchById(Integer id);
    boolean addBranch(Branch branch);
    void updateBranch(Branch branch);
    void deleteBranch(Integer id);
}
