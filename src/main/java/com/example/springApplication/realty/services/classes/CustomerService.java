package com.example.springApplication.realty.services.classes;

import java.util.List;

import com.example.springApplication.realty.dao.interfaces.ICustomerDAO;
import com.example.springApplication.realty.services.interfaces.ICustomerService;
import com.example.springApplication.realty.entities.classes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public List<Customer.CustomerStruct> getAllCustomers() {
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
