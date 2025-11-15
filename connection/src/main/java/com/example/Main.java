package com.example;
import java.sql.*;


public class Main {
    public static void main(String[] args) {
        
        final String DB_URL = "jdbc:postgresql://192.168.0.31:5434/easytap";
        final String DB_USER = "easytap";
        final String DB_PASSWORD = "Gan354m!";

        Connection conn = null;
        Statement stmt = null;

        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database successfully.");
        } catch (SQLException e) {
            e.printStackTrace();    

        }
    }
}