package com.example.springApplication.realty.services;

import java.util.List;

import javax.annotation.Resource;

import com.example.springApplication.realty.dao.ICustomerDAO;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.example.springApplication.realty.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerByID(id);
    }

    @Override
    public synchronized boolean addCustomer(Customer customer) {
        if(customerDAO.customerExists(customer.getName(), customer.getBudget())){
            return false;
        } else {
            customerDAO.addCustomer(customer);
            return true;
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}
