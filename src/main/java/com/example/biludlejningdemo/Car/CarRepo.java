package com.example.biludlejningdemo.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CarRepo {

    @Autowired
    JdbcTemplate template;

    public List<Car> fetchAll(){
        String sql = "SELECT * FROM car";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);

        return template.query(sql,rowMapper);
    }

    public void createCar(Car car){
        String sql = "INSERT INTO car VALUES(?,?,?,?,?,?,?,?,?,?);";
        template.update(sql,car.getID(),car.getBrand(),car.getModel(),car.getPricePrMonth(),car.getGear(),
                car.getFuel(),car.getC02(),car.getKmPrLiter(),car.getDamages(),car.getAvailability());
    }

}
