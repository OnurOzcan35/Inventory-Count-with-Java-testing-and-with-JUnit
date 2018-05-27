/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection conn = null;

    public static void connect() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/stock?user=root&password=zerone");
    }
    public static void connect2() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/stock?user=root&password=zzzz");
    }

    public static void disconnect() {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
