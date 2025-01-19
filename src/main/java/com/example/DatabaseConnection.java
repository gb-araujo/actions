package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://invalid:5432/demo";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin123";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
