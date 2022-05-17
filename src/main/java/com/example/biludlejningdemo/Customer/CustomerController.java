package com.example.biludlejningdemo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers.html")
    public String customers(Model model){
        List<Customer> customerList = customerService.fetchAll();
        model.addAttribute("customers", customerList);
        String msg = ("Antal kunder i alt: " +numberOfCustomers(customerList));
        model.addAttribute("message",msg);
        return "/customers";
    }

    @GetMapping("/newCustomer.html")
    public String newCustomer(){
        return "newCustomer";
    }

    @PostMapping("/newCustomer")
    public String newCustomer(@ModelAttribute Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/";
    }

    public int numberOfCustomers(List<Customer> customerList){
        int customers = customerList.size();
        return customers;
    }



}
