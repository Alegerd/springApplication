package com.example.springApplication;

import com.example.springApplication.realty.entities.Customer;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class RestClientUtil {
   public void getCustomerByIdDemo(){
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON);
       RestTemplate restTemplate = new RestTemplate();
       String url =  "http://localhost:8080/user/customer/{id}";
       HttpEntity<String> requestEntity = new HttpEntity<>(headers);
       ResponseEntity<Customer> responseEntity = restTemplate.exchange(url,HttpMethod.GET, requestEntity,Customer.class, 1);
       Customer customer = responseEntity.getBody();
       System.out.println("Id: " + customer.getId() + ", Name: " + customer.getName()+
                          ", Budget: " + customer.getBudget());
   }

   public void getAllCustomersDemo(){
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON);
       RestTemplate restTemplate = new RestTemplate();
       String url = "http://localhost:8080/user/customers";
       HttpEntity<String> requestEntity = new HttpEntity<>(headers);
       ResponseEntity<Customer[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Customer[].class);
       Customer[] customers = responseEntity.getBody();
       for (Customer customer: customers ) {
           System.out.println("Id: " + customer.getId() + ", Name: " + customer.getName()+
                   ", Budget: " + customer.getBudget());
       }
   }

   public void addCustomerDemo(){
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON);
       RestTemplate restTemplate = new RestTemplate();
       String url = "http://localhost:8080/user/customer";
       Customer newCustomer = new Customer();
       newCustomer.setName("Test_Customer");
       newCustomer.setBudget(1001);
       HttpEntity<String> requestEntity = new HttpEntity<>(headers);
       URI uri = restTemplate.postForLocation(url, requestEntity);
       System.out.println(uri.getPath());
   }

   public static void main(String[] args){
       RestClientUtil util = new RestClientUtil();
       util.getAllCustomersDemo();
   }

    /**
     * Дописать методы обновления, удаления
     */
}