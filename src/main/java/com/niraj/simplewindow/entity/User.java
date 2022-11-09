/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.simplewindow.entity;

/**
 *
 * @author Dell
 */
public class User {
    int uid;
    String name;
    String pass;
    String role;

    public User(int uid, String name, String pass, String role) {
        this.uid = uid;
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public User() {
    }

    public User(String name, String pass, String role) {
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name=" + name + ", password=" + pass + ", role=" + role + '}';
    }
    
    
}
