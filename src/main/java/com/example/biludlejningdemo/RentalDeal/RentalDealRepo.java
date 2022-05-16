package com.example.biludlejningdemo.RentalDeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class RentalDealRepo {

    @Autowired
    JdbcTemplate template;

    public List<RentalDeal> fetchAll(){
        String sql = "SELECT * FROM rental_deal";
        RowMapper<RentalDeal> rowMapper = new BeanPropertyRowMapper<>(RentalDeal.class);
        return template.query(sql,rowMapper);
    }


    public void createRentalDeal(RentalDeal rentalDeal){
        String sql = "INSERT INTO rental_deal VALUES(?,?,?,?,?,?,?,?,?);";
        template.update(sql,rentalDeal.getRentalID(),rentalDeal.getCustomerID(),rentalDeal.getCarID(),
                rentalDeal.getSub(),rentalDeal.getPrice(),rentalDeal.getPickUpLocation(),rentalDeal.getDropOffLocation(),
                rentalDeal.getDamageBefore(),rentalDeal.getDamageAfter());
    }


}
