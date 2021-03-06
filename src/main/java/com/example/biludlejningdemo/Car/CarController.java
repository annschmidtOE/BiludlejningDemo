package com.example.biludlejningdemo.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class CarController {
 @Autowired
 CarService carService;

    @GetMapping("/cars.html")
    public String cars(Model model){
        List<Car> carList = carService.fetchAll();
        model.addAttribute("cars", carList);
        String msg = ("Antal biler i alt: " +totalNumberOfCars(carList));
        model.addAttribute("message",msg);
        return "/cars";
    }

    @GetMapping("/newCar.html")
    public String create(){
        return "newCar";
    }

    @PostMapping("/newCar")
    public String create(@ModelAttribute Car car){
        carService.createCar(car);
        return "redirect:/";
    }

    public int totalNumberOfCars(List<Car> carList){
        int cars = carList.size();
        return cars;
    }

}
