/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConn;

/**
 *
 * @author ACER
 */
import java.sql.*;

public class JDBC {

    public static Connection getConnection() {
        Connection conn = null;

        String url = "jdbc:sqlserver://LAPTOP-VNOPB5Q7\\SQLEXPRESS:1433; databaseName=leatherManagerSystem;user=sa;password=123;"
                + "encrypt=true;trustServerCertificate=true";
        if (conn == null) {
            try {
                //step 1: craete connection
                conn = DriverManager.getConnection(url);
                System.out.println("Connection is established with " + conn.getCatalog());

            } catch (SQLException ex) {
                System.out.println("Connection lost =(" + ex);
            }
        }
        return conn;
    }
       

    public static void closeConnection(Connection c) {
        try{
            if(c != null){
                c.close();
                System.out.println("Connection is closed !!!");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }

}
/* lớp này có ý nghĩa tạo kết nối dữ liệu java <->sql
1. Tạo phương thức getConnection để kết nối, dạng static để đỡ tạo đối tượng mỗi khi cần kết nối
2. Đóng sự kết nối
 */
