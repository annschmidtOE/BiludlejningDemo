package com.example.biludlejningdemo.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

     @Autowired
     CarRepo carRepo;


     public List<Car> fetchAll(){return carRepo.fetchAll(); }

     public void createCar(Car car){carRepo.createCar(car);}
}