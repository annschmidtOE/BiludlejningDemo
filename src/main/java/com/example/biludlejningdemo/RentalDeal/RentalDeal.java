package com.example.biludlejningdemo.RentalDeal;

public class RentalDeal {
    private int rentalID;
    private int customerID;
    private int carID;
    private String sub;
    private double price;
    private String pickUpLocation;
    private String dropOffLocation;
    private String damageBefore;
    private String damageAfter;

    public RentalDeal(){}

    public RentalDeal(int rentalID, int customerID, int carID, String sub, double price, String pickUpLocation,
                      String dropOffLocation, String damageBefore, String damageAfter){
        setRentalID(rentalID);
        setCustomerID(customerID);
        setSub(sub);
        setPrice(price);
        setPickUpLocation(pickUpLocation);
        setDropOffLocation(dropOffLocation);
        setDamageBefore(damageBefore);
        setDamageAfter(damageAfter);
        setCarID(carID);
    }

    //GETTERS

    public int getRentalID() {return rentalID;}
    public int getCustomerID() {return customerID;}
    public String getSub() {return sub;}
    public double getPrice() {return price;}
    public String getPickUpLocation() {return pickUpLocation;}
    public String getDropOffLocation() {return dropOffLocation;}
    public String getDamageBefore() {return damageBefore;}
    public String getDamageAfter() {return damageAfter;}
    public int getCarID() {return carID;}

    //SETTERS
    public void setRentalID(int rentalID) {this.rentalID = rentalID;}
    public void setCustomerID(int customerID) {this.customerID = customerID;}
    public void setSub(String sub) {this.sub = sub;}
    public void setPrice(double price) {this.price = price;}
    public void setPickUpLocation(String pickUpLocation) {this.pickUpLocation = pickUpLocation;}
    public void setDropOffLocation(String dropOffLocation) {this.dropOffLocation = dropOffLocation;}
    public void setDamageBefore(String damageBefore) {this.damageBefore = damageBefore;}
    public void setDamageAfter(String damageAfter) {this.damageAfter = damageAfter;}
    public void setCarID(int carID) {this.carID=carID;}

    @Override
    public String toString() {
        return "RentalDeal{" +
                "rentalID=" + rentalID +
                ", customerID=" + customerID +
                ", carID=" + carID +
                ", sub='" + sub + '\'' +
                ", price=" + price +
                ", pickUpLocation='" + pickUpLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", damageBefore='" + damageBefore + '\'' +
                ", damageAfter='" + damageAfter + '\'' +
                '}';
    }
}
