/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import databaseConn.JDBC;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Category;

/**
 *
 * @author ACER
 */
public class CategoryDAO implements DAOinterface<Category> {

    public static CategoryDAO getInstance() {
        return new CategoryDAO();
    }

    @Override
    public int add(Category t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "insert into Categories(CategoryID, CategoryName) "
                    + "values('" + t.getCategoryID() + "', '" + t.getCategoryName() + "')";
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Add success !!!", "CATEGORY_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
    
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "CATEGORY_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);   
        }
        return 0;
    }

    @Override
    public int update(Category t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "update Categories"
                    + " set "
                    + "CategoryID = '" + t.getCategoryID() + "', "
                    + "CategoryName = '" + t.getCategoryName() + "' "
                    + "where CategoryID = '" + t.getCategoryID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if( kq > 0 ){
                JOptionPane.showMessageDialog(null, "Update success !!!", "CATEGORY_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "CATEGORY_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "CATEGORY_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public int delete(Category t) {
        try {
            Connection c = JDBC.getConnection();

            Statement st = c.createStatement();

            String sql = "delete from Categories "
                    + "where CategoryID = '" + t.getCategoryID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Delete success !!!", "CATEGORY_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);

            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Do not enter non-existent id !!!", "CATEGORY_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public Category selectById(Category t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Category> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Category> selectAll(JTable jtable) {
        ArrayList<Category> categories = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from Categories";
//            System.out.println("sql");    
            ResultSet rs = st.executeQuery(sql);

            //b4
            
            while (rs.next()) {
                String CategoryID = rs.getString("CategoryID");
                String CategoryName = rs.getString("CategoryName");

                Category cate = new Category(CategoryID, CategoryName);
                categories.add(cate);
                
                String tbData[] = {CategoryID, CategoryName};
                DefaultTableModel model = (DefaultTableModel)jtable.getModel();
                
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
