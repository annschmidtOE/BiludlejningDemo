package com.example.biludlejningdemo.Customer;

import com.example.biludlejningdemo.Car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
@Autowired
CustomerRepo customerRepo;

    public List<Customer> fetchAll(){return customerRepo.fetchAll(); }

    public void createCustomer(Customer customer) {customerRepo.createCustomer(customer);}

}
