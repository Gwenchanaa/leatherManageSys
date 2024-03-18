package DAO;

import model.*;
import java.sql.*;
import databaseConn.JDBC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderDetailDAO implements DAOinterface<OrderDetail> {

    public static OrderDetailDAO getInstance() {
        return new OrderDetailDAO();
    }

    @Override
    public int add(OrderDetail t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "insert into OrderDetails(OrderID, ProductID, TotalPrice, TotalQuantity) "
                    + "values ('" + t.getOrderID() + "', " + "'" + t.getProductID() + "', '" + t.getPrice()
                    + "', '" + t.getQuantity() + "') ";
            String sqlUpdatePro = "update Products "
                    + "set "
                    + "UnitsInStock = UnitsInStock - " + t.getQuantity() + ", "
                    + "UnitsOnOrder = UnitsOnOrder + " + t.getQuantity() + " "
                    + "where ProductID = '" + t.getProductID() + "' ";

            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Add success !!!", "ORDER_DETAIL_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            int kq1 = st.executeUpdate(sqlUpdatePro);
            System.out.println("ban thuc thi " + sqlUpdatePro);
            System.out.println(kq1 + " thay doi");
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "ORDER_DETAIL_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(OrderDetail t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            // Cộng số lượng cũ cho lượng sp
            String sql = "update Products \n"
                    + "set \n"
                    + "UnitsInStock = UnitsInStock +  (select TotalQuantity\n"
                    + "from OrderDetails as o\n"
                    + "join Products as p \n"
                    + "on p.ProductID = o.ProductID\n"
                    + "where p.ProductID = '" + t.getProductID()+ "'), "
                    + "UnitsOnOrder = UnitsOnOrder -  (select TotalQuantity\n"
                    + "from OrderDetails as o\n"
                    + "join Products as p \n"
                    + "on p.ProductID = o.ProductID\n"
                    + "where p.ProductID = '" + t.getProductID()+ "') "
                    + "where ProductID = '" + t.getProductID()+ "' "
            // update cột quanitty giá trị nhập mới      
                    + "update OrderDetails \n"
                    + "set \n"
                    + "OrderID = '" + t.getOrderID() + "', \n"
                    + "ProductID = '" + t.getProductID() + "', \n"
                    + "TotalQuantity = '" + t.getQuantity() + "',\n "
                    + "TotalPrice = '" + t.getPrice() + "'\n"
                    + "where OrderID = '" + t.getOrderID() + "' and ProductID = '" + t.getProductID()+"'"
                    
            // update cột stock với order gtri quantity mới       
                    + "update Products \n"
                    + "set \n"
                    + "UnitsInStock = UnitsInStock -  (select TotalQuantity\n"
                    + "from OrderDetails as o\n"
                    + "join Products as p \n"
                    + "on p.ProductID = o.ProductID\n"
                    + "where p.ProductID = '" + t.getProductID()+ "'), "
                    + "UnitsOnOrder = UnitsOnOrder +  (select TotalQuantity\n"
                    + "from OrderDetails as o\n"
                    + "join Products as p \n"
                    + "on p.ProductID = o.ProductID\n"
                    + "where p.ProductID = '" + t.getProductID()+ "') "
                    + "where ProductID = '" + t.getProductID()+ "' ";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Update success !!!", "ORDER_DETAIL_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "ORDER_DETAIL_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Do not enter non-existent category id !!!", "ORDER_DETAIL_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }

        return 0;
    }

    @Override
    public int delete(OrderDetail t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete from OrderDetails "
                    + "where OrderID = '" + t.getOrderID() + "'";
            int kq = st.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Delete success !!!", "ORDER_DETAIL_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<OrderDetail> selectAll(JTable jtable) {
        ArrayList<OrderDetail> orderDetails = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from OrderDetails";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            //b4
            while (rs.next()) {
                String OrderID = rs.getString("OrderID");
                String ProductID = rs.getString("ProductID");
                double Price = rs.getDouble("TotalPrice");
                int Quantity = rs.getInt("TotalQuantity");

                OrderDetail pro = new OrderDetail(OrderID, ProductID, Quantity, Price);
                orderDetails.add(pro);
                String a = String.valueOf(Quantity);
                String b = String.valueOf(Price);
                String tbData[] = {OrderID, ProductID, a, b};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderDetails;
    }

    @Override
    public OrderDetail selectById(OrderDetail t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<OrderDetail> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
