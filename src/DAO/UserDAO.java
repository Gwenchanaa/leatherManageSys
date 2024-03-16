/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.User;
import java.sql.*;
import databaseConn.JDBC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.User;

public class UserDAO implements DAOinterface<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    @Override
    public int add(User t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into Users(UserID,UserPassword,UserName) "
                    + "values('" + t.getUserID() + "', '" + t.getUserPassword() + "', '" + t.getUserName() + "')";

            System.out.println(sql);
            int kq = st.executeUpdate(sql);
            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            JOptionPane.showMessageDialog(null, "Add success !!!", "USER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);

            JDBC.closeConnection(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter duplicate id !!!", "USER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(User t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "update Users "
                    + "set "
                    + "UserID = '" + t.getUserID() + "', "
                    + "UserPassword = '" + t.getUserPassword() + "', "
                    + "UserName = '" + t.getUserName() + "' "
                    + "where UserID = '" + t.getUserID() + "'";
            System.out.println(sql);
            int kq = st.executeUpdate(sql);

            System.out.println("ban thuc thi " + sql);
            System.out.println(kq + " thay doi");
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Update success !!!", "USER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "USER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }

            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Do not enter non-existent category id !!!", "USER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }

        return 0;
    }

    @Override
    public int delete(User t) {
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            String sql = "delete from Users "
                    + "where UserID = '" + t.getUserID() + "'";
            int kq = st.executeUpdate(sql);

            System.out.println(sql);
            System.out.println("thay doi" + kq);
            if (kq > 0) {
                JOptionPane.showMessageDialog(null, "Delete success !!!", "USER_DB CHANGED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID does not exist !!!", "USER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Do not enter non-existent user id !!!", "USER_DB UNCHANGED", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public ArrayList<User> selectAll(JTable jtable) {
        ArrayList<User> users = new ArrayList<>();

        try {
            //b1
            Connection c = JDBC.getConnection();
            //b2
            Statement st = c.createStatement();
            //b3
            String sql = "select * from Users";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            //b4
            while (rs.next()) {
                String UserID = rs.getString("UserID");
                String UserPassword = rs.getString("UserPassword");

                String UserName = rs.getString("UserName");

                User pro = new User(UserID,UserPassword, UserName);
                users.add(pro);
                
                String tbData[] = {UserID, UserPassword, UserName};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User selectById(User t) {
        User u = null;
        try {
            Connection c = JDBC.getConnection();
            Statement st = c.createStatement();
            
            String sql = "select * " +
                    "from Users " + 
                    "where UserID = '" + t.getUserID() + "' and UserPassword = '" + t.getUserPassword() +"' ";
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            while (rs.next()) {
                String UserID = rs.getString("UserID");
                String UserPassword = rs.getString("UserPassword");
                String UserName = rs.getString("UserName");
                u = new User(UserID,UserPassword,UserName);
            }
            JDBC.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
