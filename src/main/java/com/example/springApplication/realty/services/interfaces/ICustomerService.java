package com.example.springApplication.realty.services.interfaces;

import com.example.springApplication.realty.entities.classes.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer.CustomerStruct> getAllCustomers();
    Customer getCustomerById(int id);
    boolean addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
