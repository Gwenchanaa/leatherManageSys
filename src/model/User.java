/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class User {

    String UserID, UserPassword, UserName;

    public User(String UserID, String UserPassword, String UserName) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
        this.UserName = UserName;
    }

    public User(String UserID) {
        this.UserID = UserID;
    }

    public User(String UserID, String UserPassword) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
    }
    
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String toString() {
        return "User{" + "UserID=" + UserID + ", UserPassword=" + UserPassword + ", UserName=" + UserName + '}';
    }
    
}
