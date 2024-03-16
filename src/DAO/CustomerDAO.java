/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.sql.*;
import databaseConn.JDBC;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Customer;

/**
 *
 * @author ACER
 */
public class CustomerDAO implements DAOinterface<Customer> {

    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }

    @Override
    public int add(Customer t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "insert into Customers(CustomerID, CustomerName, CustomerPhone) "
                    + "values ('" + t.getCustomerID() + "', " + "'"
                    + t.getCustomerName() + "', " + "'" + t.getCustomerPhone()  + "')";

            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println("thay doi " + kq);
            JOptionPane.showMessageDialog(null, "add success !!!", "CUSTOMER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);

            JDBC.closeConnection(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "CUSTOMER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Customer t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Customers "
                    + "set "
                    + "CustomerID = '" + t.getCustomerID() + "', "
                    + "CustomerName = '" + t.getCustomerName() + "', "
                    + "CustomerPhone = '" + t.getCustomerPhone() + "' "
                    + "where CustomerID = '" + t.getCustomerID() + "'";
            int kq = st.executeUpdate(sql);
            System.out.println(sql);
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Update success !!!", "CUSTOMER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "CUSTOMER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "error !!!", "CUSTOMER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }

        return 0;
    }

    @Override
    public int delete(Customer t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete from Customers "
                    + "where CustomerID = '" + t.getCustomerID() + "'";
            int kq = st.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Delete success !!!", "CATEGORY_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter non-existent id !!!", "CATEGORY_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public ArrayList<Customer> selectAll(JTable jtable) {
        ArrayList<Customer> customers = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from Customers";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            //b4
            while (rs.next()) {
                String CustomerID = rs.getString("CustomerID");
                String CustomerName = rs.getString("CustomerName");
                String CustomerPhone = rs.getString("CustomerPhone");

                Customer cus = new Customer(CustomerID, CustomerName, CustomerPhone);
                customers.add(cus);

                String tbData[] = {CustomerID, CustomerName, CustomerPhone};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer selectById(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Customer> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
