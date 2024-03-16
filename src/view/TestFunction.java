/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import databaseConn.JDBC;
import java.sql.*;
import function.Function;

import java.util.ArrayList;

import model.*;
import DAO.*;

/**
 *
 * @author ACER
 */
public class TestFunction {

    public static void main(String[] args) {
//        Connection c = JDBC.getConnection();
//        System.out.println(c);
//        
//        JDBC.closeConnection(c);
//        String phone = Function.checkPhone();
//        int num = Function.checkInt("tuoi", 18, 50);
//        String s = Function.checkString("ten");
        Order c1 = new Order("ord2","","us1","cus1");
//        Category c2 = new Category("cate2", "casual Items");
        // INSERT
        OrderDAO.getInstance().add(c1);
//        CategoryDAO.getInstance().add(c2);
        // Delete
//        CategoryDAO.getInstance().delete(c1);
//        ArrayList<Category> c = CategoryDAO.getInstance().selectAll();
//        for (Category d : c) {
//            System.out.println(d.toString());
//        }
//        Customer cus = new Customer("cus1", "123", "Nguyen Thi B", "0825143790", "271 an duong vuong");
//        CustomerDAO.getInstance().add(cus);
//        Customer cus1 = new Customer("cus2", "123", "Nguyen Van A", "0825143790", "271 an duong vuong");
//        CustomerDAO.getInstance().add(cus1);
//        ArrayList<Customer> c = CustomerDAO.getInstance().selectAll();
//        for (Customer d : c) {
//            System.out.println(d.toString());
//        }
//        Product pro = new Product("cate1","pro1", "milk", 24.5, 20, 16, 4);
//        ProductDAO.getInstance().add(pro);
//        Product pro2 = new Product("cate1","pro2", "beef", 24.5, 20, 16, 4);
//        ProductDAO.getInstance().add(pro2);
        
//        ArrayList<Product> products = ProductDAO.getInstance().selectAll();
//        for( Product d: products){
//            System.out.println("hello "+ d.toString());
//        }
    }
}
