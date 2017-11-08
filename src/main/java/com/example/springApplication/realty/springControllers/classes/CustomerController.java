package com.example.springApplication.realty.springControllers.classes;

import com.example.springApplication.realty.entities.classes.Customer;
import com.example.springApplication.realty.services.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("user")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "customer/{id}",
            method = RequestMethod.GET,
            headers = {"Content-type=application/json"})
    @ResponseBody
    public Customer getCustomerById(@PathVariable("id") Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return customer;
    }

    @GetMapping("customers")
    public ResponseEntity<List<Customer.CustomerStruct>> getAllCustomers(){
        List<Customer.CustomerStruct> customers = customerService.getAllCustomers();
        return new ResponseEntity<List<Customer.CustomerStruct>>(customers, HttpStatus.OK);
    }

    @PostMapping("customer")
    public ResponseEntity<Void> addCustomer(@RequestBody Customer customer, UriComponentsBuilder builder){
        boolean flag = customerService.addCustomer(customer);
        if(!flag){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/customer/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("customer")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @DeleteMapping("customer/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
