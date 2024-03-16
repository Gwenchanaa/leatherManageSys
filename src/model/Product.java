/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Product {

    double ProductPrice;
    String ProductID, ProductName, CategoryID;
    int UnitsInStock, UnitsOnOrder;

    public Product(String CategoryID, String ProductID, String ProductName, double ProductPrice, int UnitsInStock, int UnitsOnOrder) {
        this.CategoryID = CategoryID;
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.UnitsInStock = UnitsInStock;
        this.UnitsOnOrder = UnitsOnOrder;
    }

    public Product(String ProductID) {
        this.ProductID = ProductID;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(int UnitsInStock) {
        this.UnitsInStock = UnitsInStock;
    }

    public int getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(int UnitsOnOrder) {
        this.UnitsOnOrder = UnitsOnOrder;
    }

    @Override
    public String toString() {
        return "Product{" + "CategoryID=" + CategoryID + ", ProductID=" + ProductID + ", ProductName=" + ProductName 
                +  ", ProductPrice=" + ProductPrice  
                + ", UnitsInStock=" + UnitsInStock + ", UnitsOnOrder=" + UnitsOnOrder + '}';
    }
    
    
}
