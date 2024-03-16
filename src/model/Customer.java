/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Customer {

    String CustomerID, CustomerName, CustomerPhone;

    public Customer(String CustomerID, String CustomerName, String CustomerPhone) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerPhone = CustomerPhone;
    }
    public Customer(String CustomerID) {
        this.CustomerID = CustomerID;
    }
    
    public Customer(String CustomerID, String CustomerName) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    @Override
    public String toString() {
        return "Customer{" + "CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", CustomerPhone=" + CustomerPhone + '}';
    }
    
    
}

