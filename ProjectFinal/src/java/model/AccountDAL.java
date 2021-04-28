/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hung Trinh
 */
public class AccountDAL {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String xSql = null;
    
    public AccountDAL() {
        createConnection();
    }

    public void finalize() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createConnection() {
        DBContext u = new DBContext();
        try {
            con = u.getConnection();
        } catch (Exception e) {
            System.out.println("Connect database Fail");
            e.printStackTrace();
        }
    }
    
    public Account getAccountByUsername(String username){
        if (con == null) {
            createConnection();
        }
        xSql = "select * from Accounts where username=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getString("email"), rs.getString("phone"), rs.getString("address"), rs.getInt("role"));
                ps.close();
                rs.close();
                return a;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Account checkAccount(String user, String pass) {
        if (con == null) {
            createConnection();
        }
        xSql = "select * from Accounts where username=? AND password=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getString("email"), rs.getString("phone"), rs.getString("address"), rs.getInt("role"));
                ps.close();
                rs.close();
                return a;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean addAccount(String username, String password, String fullname, String email, String phone, String address) {
        if (con == null) {
            createConnection();
        }
        xSql = "insert into Accounts(username, password, fullname, email, phone, address, role) values (?, ?, ?, ?, ?, ?, 2)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, fullname);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, address);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateAccount(String username, String email, String phone, String address, String newpass) {
        if (con == null) {
            createConnection();
        }
        xSql = "update Accounts set password=?, email=?, phone=?, [address]=? where username=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, newpass);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setString(5, username);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
