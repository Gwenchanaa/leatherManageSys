/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.regex.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Function {

    static Scanner sc = new Scanner(System.in);

    public static String checkPhone() {
        String a;
        Pattern p = Pattern.compile("^[0]\\d{9}$");
        System.out.println("Nhap so dien thoai ");
        a = sc.nextLine();
        boolean check = false;

        while (check != true) {
            if (p.matcher(a).find()) {
                check = true;
            } else {
                System.out.println("Nhap lai so dien thoai");
                a = sc.nextLine();
            }
        }
        return a;
    }

    public static int checkInt(String noun, int min, int max) {
        int a = 0;
        boolean check = false;
        System.out.println("nhap " + noun);
        while (check != true) {
            try {
                String input = sc.nextLine();
                a = Integer.parseInt(input);
                if (min <= a && a <= max) {
                    check = true;
                } else {
                    System.out.println("Nhap lai " + noun + " trong khoang " + min + " den " + max);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("nhap " + noun + " la mot so");
            }
        }

        return a;
    }
    
    public static String checkString(String noun){
        String s = "";
        boolean check = false;
        System.out.println("Nhap " + noun);
        while(check != true){
            s = sc.nextLine();
            if( s.equals("")){
                System.out.println("Khong de trong !");
                JOptionPane.showMessageDialog(null, "Do not leave it blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
            } else {
                check = true;
            }
        }
        return s;
    }
}
