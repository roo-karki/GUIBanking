/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.simplewindow.controller;

import com.niraj.simplewindow.entity.User;
import com.niraj.simplewindow.connector.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class UserController {
    dbConnector dbConn;
    User user;

    public UserController() {
        dbConn = new dbConnector("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/bankdatabase", "root", "N3Ur0t0x1c");
        
    }
    
    public boolean addUser(User user){
        String stmt = "INSERT INTO `user` (`uid`, `name`, `pass`, `role`) VALUES ('"+user.getUid()+"', '"+user.getName()+"', '"+user.getPassword()+"', '"+user.getRole()+"');";
        return dbConn.cud(stmt);
    }
    
    public User verifyUser(String username, String password){
        String stmt = "SELECT * FROM user WHERE user.name='"+username+"' AND user.pass = '"+password+"';";
        ResultSet rs = dbConn.select(stmt);
        try {
            if(rs.next()){
                user = new User(rs.getInt("uid"), rs.getString("name"), rs.getString("pass"), rs.getString("role"));
            }
            else{
                user = null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        dbConn.closeConnection();
        return user;
    }
    
    
}
