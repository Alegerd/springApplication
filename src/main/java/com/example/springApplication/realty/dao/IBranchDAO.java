package com.example.springApplication.realty.dao;

import com.example.springApplication.realty.entities.Branch;

import java.util.List;

public interface IBranchDAO {
    Branch getBranchById(Integer id);
    List<Branch> getAllBranches();
    void addNewBranch(Branch branch);
    void updateBranch(Branch branch);
    void deleteBranch(Integer id);
    boolean branchExists(Integer id, String adress);
}
