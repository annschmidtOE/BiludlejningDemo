package com.example.biludlejningdemo.RentalDeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalDealService {
    @Autowired
    RentalDealRepo rentalDealRepo;

    public List<RentalDeal> fetchAll(){return rentalDealRepo.fetchAll(); }

    public void createRentalDeal(RentalDeal rentalDeal){rentalDealRepo.createRentalDeal(rentalDeal);}




}
