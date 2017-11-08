package com.example.springApplication.realty.services.classes;

import com.example.springApplication.realty.dao.classes.BranchDAO;
import com.example.springApplication.realty.entities.classes.Branch;
import com.example.springApplication.realty.services.interfaces.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("branchService")
@Transactional
public class BranchService implements IBranchService {

    @Autowired
    private BranchDAO branchDAO;

    @Override
    public List<Branch.BranchStruct> getAllBranches() {
        return branchDAO.getAllBranches();
    }

    @Override
    public Branch getBranchById(Integer id) {
        return branchDAO.getBranchById(id);
    }

    @Override
    public boolean addBranch(Branch branch) {
        if(branchDAO.branchExists(branch.getId(),branch.getAdress())){
            return false;
        }
        else {
            branchDAO.addNewBranch(branch);
            return true;
        }
    }

    @Override
    public void updateBranch(Branch branch) {
        branchDAO.updateBranch(branch);
    }

    @Override
    public void deleteBranch(Integer id) {
        branchDAO.deleteBranch(id);
    }
}
