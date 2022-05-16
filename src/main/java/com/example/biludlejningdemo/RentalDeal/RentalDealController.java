package com.example.biludlejningdemo.RentalDeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class RentalDealController {
    @Autowired
    RentalDealService rentalDealService;

    @GetMapping("/rentalDeals.html")
    public String rentalDeal(Model model){
        List<RentalDeal> rentalDealList = rentalDealService.fetchAll();
        model.addAttribute("rentalDeals", rentalDealList);
        System.out.println(expectedPayment((ArrayList<RentalDeal>) rentalDealList));
        return "/rentalDeals";
    }

    @GetMapping("/newRentalDeal.html")
    public String createRentalDeal(){
        return "newRentalDeal";
    }

    @PostMapping("/newRentalDeal")
    public String create(@ModelAttribute RentalDeal rentalDeal){
        rentalDealService.createRentalDeal(rentalDeal);
        return "redirect:/";
    }

    public double expectedPayment(ArrayList<RentalDeal> rentalDealList) {
        double expectedPay = 0.0;
        for (int i = 0; i < rentalDealList.size(); i++) {
            double sum=rentalDealList.get(i).getPrice();
            expectedPay+=sum;
        }
        return expectedPay;
    }


}
