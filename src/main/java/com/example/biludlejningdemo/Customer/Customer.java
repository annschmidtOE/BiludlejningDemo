package com.example.biludlejningdemo.Customer;

public class Customer {
    private int customerID;
    private int driverLicenceNumber;
    private String firstName;
    private String lastName;
    private int phone;
    private String mail;
    private int zip;
    private String city;


    public Customer(){}

    public Customer(int customerID, int driverLicenceNumber, String firstName, String lastName, int phone,
                    String mail, int zip, String city){
        setCustomerID(customerID);
        setDriverLicenceNumber(driverLicenceNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setMail(mail);
        setZip(zip);
        setCity(city);
    }
    //GETTERS
    public int getCustomerID() {return customerID;}
    public int getDriverLicenceNumber() {return driverLicenceNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getPhone() {return phone;}
    public String getMail() {return mail;}
    public int getZip() {return zip;}
    public String getCity() {return city;}
    //SETTERS
    public void setCustomerID(int customerID) {this.customerID = customerID;}
    public void setDriverLicenceNumber(int driverLicenceNumber) {this.driverLicenceNumber = driverLicenceNumber;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPhone(int phone) {this.phone = phone;}
    public void setMail(String mail) {this.mail = mail;}
    public void setZip(int zip) {this.zip = zip;}
    public void setCity(String city) {this.city = city;}

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", driverLicenceNumber=" + driverLicenceNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", mail='" + mail + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }
}

