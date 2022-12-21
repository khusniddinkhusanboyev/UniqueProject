package Networking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample{
    static final String DB_URL = "jdbc:mysql://localhost/3306";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection("http://127.0.0.1/openserver/phpmyadmin/index.php?token=38208b79ca0f726ec9d5ac72431b039d");
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}