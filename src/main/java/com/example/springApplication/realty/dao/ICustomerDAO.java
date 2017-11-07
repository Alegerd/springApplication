package com.example.springApplication.realty.dao;
import com.example.springApplication.realty.entities.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> getAllCustomers();
    Customer getCustomerByID(Integer id);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
    boolean customerExists(String name, Integer budget);
}
