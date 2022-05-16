package com.example.biludlejningdemo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepo {
    @Autowired
    JdbcTemplate template;

    public List<Customer> fetchAll(){
        String sql = "SELECT * FROM customer";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql,rowMapper);
    }

    public void createCustomer(Customer customer){
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?);";
        template.update(sql,customer.getCustomerID(),customer.getDriverLicenceNumber(),customer.getFirstName(),
                customer.getLastName(),customer.getPhone(),customer.getMail(),customer.getZip(),customer.getCity());
    }
}
