package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectAndPrint {
    static final String DB_URL = "jdbc:mysql://localhost/jdbc_test";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args) {

        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "select roll, name, dept, marks from students";
            ResultSet rs = stmt.executeQuery(sql);
            // Extract data from result set
            while (rs.next()) {
                System.out.print("roll = " + rs.getInt("roll") + " ");
                System.out.print("name = " + rs.getString("name") + " ");
                System.out.print("dept = " + rs.getString("dept") + " ");
                System.out.print("marks = " + rs.getFloat("marks") + " ");
                System.out.println();

            }
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("I am here");

    }
}
