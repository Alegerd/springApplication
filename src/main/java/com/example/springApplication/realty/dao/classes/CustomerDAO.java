package com.example.springApplication.realty.dao.classes;

import com.example.springApplication.realty.dao.interfaces.ICustomerDAO;
import com.example.springApplication.realty.entities.classes.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class CustomerDAO implements ICustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer.CustomerStruct> getAllCustomers() {
        String query = "FROM Customer";
        List<Customer> customers =  (List<Customer>)entityManager.createQuery(query).getResultList();
        List<Customer.CustomerStruct> cs = new ArrayList<>();
        for (Customer customer: customers){
            cs.add(customer.getCustomerInformation());
        }
        return cs;
    }

    @Override
    public Customer getCustomerByID(Integer id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer existingCustomer = getCustomerByID(customer.getId());
        existingCustomer.setBudget(customer.getBudget());
        existingCustomer.setName(customer.getName());
        entityManager.flush();
    }

    @Override
    public void deleteCustomer(Integer id) {
        entityManager.remove(getCustomerByID(id));
    }

    @Override
    public boolean customerExists(String name, Integer budget) {
        String hql = "FROM Customer as cus WHERE cus.Customer_Name = ? and cus.Budget = ?";
        int count = entityManager.createQuery(hql).setParameter(0, name)
                .setParameter(1, budget).getResultList().size();
        return count > 0 ? true : false;
    }
}
