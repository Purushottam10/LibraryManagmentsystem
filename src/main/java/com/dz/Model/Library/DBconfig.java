package com.dz.Model.Library;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconfig {

    public static Connection getconnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/data?useSSL=false", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fdggggggggggggggg");
        }
        return null;
    }





}
