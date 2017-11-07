package com.example.springApplication.realty.dao;

import com.example.springApplication.realty.entities.Branch;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class BranchDAO implements IBranchDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Branch getBranchById(Integer id) {
        return entityManager.find(Branch.class, id);
    }

    @Override
    public List<Branch> getAllBranches() {
        String query = "FROM Branch";
        return (List<Branch>)entityManager.createQuery(query).getResultList();
    }

    @Override
    public void addNewBranch(Branch branch) {
        entityManager.persist(branch);
    }

    @Override
    public void updateBranch(Branch branch) {
        Branch existingBranch = entityManager.find(Branch.class, branch.getId());
        existingBranch.setId(branch.getId());
        existingBranch.setAdress(branch.getAdress());
        entityManager.flush();
    }

    @Override
    public void deleteBranch(Integer id) {
        entityManager.remove(getBranchById(id));
    }

    @Override
    public boolean branchExists(Integer id, String adress) {
        String query = "FROM Branch as br WHERE br.Branch_ID = ? AND br.Branch_Adress = ?";
        int count = entityManager.createQuery(query).setParameter(0,id).setParameter(1,adress).getResultList().size();
        return count > 0 ? true : false;
    }
}
