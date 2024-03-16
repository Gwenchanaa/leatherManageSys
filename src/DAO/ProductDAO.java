package DAO;

import model.Product;
import java.sql.*;
import databaseConn.JDBC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductDAO implements DAOinterface<Product> {

    public static ProductDAO getInstance() {
        return new ProductDAO();
    }

    @Override
    public int add(Product t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "insert into Products(ProductID, ProductName, ProductPrice, UnitsInStock, UnitsOnOrder,CategoryID) "
                    + "values ('" + t.getProductID() + "', " + "'" + t.getProductName() + "', " + "'" + t.getProductPrice() + "', " + "'" + t.getUnitsInStock() + "', " + "'" + t.getUnitsOnOrder() + "', " + "'"
                    + t.getCategoryID() + "')";

            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Add success !!!", "PRODUCT_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);

            JDBC.closeConnection(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "PRODUCT_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Product t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Products "
                    + "set "
                    + "ProductID = '" + t.getProductID() + "', "
                    + "ProductName = '" + t.getProductName() + "', "
                    + "ProductPrice = '" + t.getProductPrice() + "', "
                    + "UnitsInStock = '" + t.getUnitsInStock() + "', "
                    + "UnitsOnOrder = '" + t.getUnitsOnOrder() + "', "
                    + "CategoryID = '" + t.getCategoryID() + "' "
                    + "where ProductID = '" + t.getProductID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Update success !!!", "PRODUCT_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "PRODUCT_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Do not enter non-existent category id !!!", "PRODUCT_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }

        return 0;
    }

    @Override
    public int delete(Product t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete from Products "
                    + "where ProductID = '" + t.getProductID() + "'";
            int kq = st.executeUpdate(sql);
            System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Delete success !!!", "PRODUCT_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Product> selectAll(JTable jtable) {
        ArrayList<Product> products = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from Products";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            //b4
            while (rs.next()) {
                String ProductID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                double ProductPrice = rs.getDouble("ProductPrice");
                int UnitsInStock = rs.getInt("UnitsInStock");
                int UnitsOnOrder = rs.getInt("UnitsOnOrder");
                String CategoryID = rs.getString("CategoryID");

                Product pro = new Product(CategoryID, ProductID, ProductName, ProductPrice, UnitsInStock, UnitsOnOrder);
                products.add(pro);
                String a = String.valueOf(ProductPrice);
                String b = String.valueOf(UnitsOnOrder);
                String d = String.valueOf(UnitsInStock);
                String tbData[] = {ProductID, CategoryID, ProductName, a, b, d};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product selectById(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Product> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
