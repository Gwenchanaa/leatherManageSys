/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import databaseConn.JDBC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Order;

public class OrderDAO implements DAOinterface<Order> {

    public static OrderDAO getInstance() {
        return new OrderDAO();
    }

    @Override
    public int add(Order t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "insert into Orders(OrderID,UserID,CustomerID,OrderDate) "
                    + "values('" + t.getOrderID() + "', '"
                    + t.getUserID() + "', '" + t.getCustomerID() + "', '" + t.getOrderDate() + "')";
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Add success !!!", "ORDER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);

            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "ORDER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public int update(Order t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "update Orders"
                    + " set "
                    + "OrderID = '" + t.getOrderID() + "', "
                    + "OrderDate = '" + t.getOrderDate() + "', "
                    + "UserID = '" + t.getUserID() + "', "
                    + "CustomerID = '" + t.getCustomerID() + "' "
                    + "where OrderID = '" + t.getOrderID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Update success !!!", "ORDER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "ORDER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Do not enter non-existent id !!!", "ORDER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Order t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "delete from Orders "
                    + "where OrderID = '" + t.getOrderID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Delete success !!!", "ORDER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Do not enter non-existent id !!!", "ORDER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Do not leave id blank !!!", "ORDER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public Order selectById(Order t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Order> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Order> selectAll(JTable jtable) {
        ArrayList<Order> categories = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from Orders";
//            System.out.println("sql");    
            ResultSet rs = st.executeQuery(sql);
            //b4

            while (rs.next()) {
                String OrderID = rs.getString("OrderID");
                String OrderDate = rs.getString("OrderDate");
                String UserID = rs.getString("UserID");
                String CustomerID = rs.getString("CustomerID");

                Order o = new Order(OrderID, OrderDate, UserID, CustomerID);
                categories.add(o);

                String tbData[] = {OrderID, OrderDate, UserID, CustomerID};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;
    }

}
