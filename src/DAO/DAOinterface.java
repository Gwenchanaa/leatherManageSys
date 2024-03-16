/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author ACER
 * @param <T>
 */
public interface DAOinterface<T> {

    public static ProductDAO getInstance(){
        return new ProductDAO();
    }
    
    public int add(T t);

    public int update(T t);

    public int delete(T t);

    public ArrayList<T> selectAll(JTable jtable);

    public T selectById(T t);

    public ArrayList<T> selectByCondition(String condition);
}
