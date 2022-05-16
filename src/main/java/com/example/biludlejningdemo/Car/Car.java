package com.example.biludlejningdemo.Car;

public class Car {

    private int ID;
    private String brand;
    private String model;
    private double pricePrMonth;
    private String gear;
    private String fuel;
    public String c02;
    private double kmPrLiter;
    private String damages;
    private String availability;

    public Car(){}

    public Car(int ID, String brand, String model, double pricePrMonth, String gear, String fuel, String c02, double kmPrLiter, String damages, String availability){
        setID(ID);
        setBrand(brand);
        setModel(model);
        setPricePrMonth(pricePrMonth);
        setGear(gear);
        setFuel(fuel);
        setC02(c02);
        setKmPrLiter(kmPrLiter);
        setDamages(damages);
        setAvailability(availability);
    }

    //Getters
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getPricePrMonth() {return pricePrMonth;}
    public String getGear() {return gear;}
    public String getFuel() {return fuel;}
    public String getC02() {return c02;}
    public double getKmPrLiter() {return kmPrLiter;}
    public int getID() {return ID;}
    public String getDamages() {return damages;}

    public String getAvailability() {return availability;}

    //Setters
    public void setBrand(String brand) {this.brand = brand;}
    public void setModel(String model) {this.model=model;}
    public void setPricePrMonth(double pricePrMonth) {this.pricePrMonth = pricePrMonth;}
    public void setGear(String gear) {this.gear = gear;}
    public void setFuel(String fuel) {this.fuel = fuel;}
    public void setC02(String c02) {this.c02 = c02;}
    public void setKmPrLiter(double kmPrLiter) {this.kmPrLiter = kmPrLiter;}
    public void setID(int ID) {this.ID=ID;}
    public void setDamages(String damages) {this.damages=damages;}

    public void setAvailability(String availability) {this.availability = availability;}

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", pricePrMonth=" + pricePrMonth +
                ", gear='" + gear + '\'' +
                ", fuel='" + fuel + '\'' +
                ", c02='" + c02 + '\'' +
                ", kmPrLiter=" + kmPrLiter +
                ", damages='" + damages + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
