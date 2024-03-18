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
import model.*;

public class a_Statistic {
    public static a_Statistic getInstance(){
        return new a_Statistic();
    }
    
    public ArrayList<OrderDetail> getData(JTable jtable){
        ArrayList<OrderDetail> list = new ArrayList<>();
        
        try {
            Connection c = JDBC.getConnection();
            
            Statement st = c.createStatement();
            String sql =
                    "select ProductID, sum(TotalQuantity) as q, sum(TotalPrice) as p\n"
                    + "from OrderDetails\n"
                    + "group by ProductID;\n";

            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            while (rs.next()) {
                String ProductID = rs.getString("ProductID");
                double Price = rs.getDouble("p");
                int Quantity = rs.getInt("q");

                String a = String.valueOf(Quantity);
                String b = String.valueOf(Price);
                String tbData[] = {ProductID, a, b};
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();

                model.addRow(tbData);
            }
            //b5
            JDBC.closeConnection(c);
        } catch (Exception e) {
        }
        return list;
    }
    
}
