
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String url = "jdbc:sqlite:test.db";

    public static void makeTables() {
        try (Connection conn = DriverManager.getConnection(url)) {
            try (Statement stmt = conn.createStatement()) {
                final String query = "CREATE TABLE IF NOT EXISTS test(id INTEGER)";
                stmt.execute(query);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
