/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Order {
    String OrderID, OrderDate, UserID, CustomerID;

    public Order(String OrderID, String OrderDate, String UserID, String CustomerID) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.UserID = UserID;
        this.CustomerID = CustomerID;
    }
    
    public Order(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", UserID=" + UserID + ", CustomerID=" + CustomerID + '}';
    }
    
}
