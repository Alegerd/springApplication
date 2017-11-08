package com.example.springApplication.realty.dao.interfaces;
import com.example.springApplication.realty.entities.classes.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer.CustomerStruct> getAllCustomers();
    Customer getCustomerByID(Integer id);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
    boolean customerExists(String name, Integer budget);
}
