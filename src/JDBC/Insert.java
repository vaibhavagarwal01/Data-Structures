package JDBC;
import java.sql.*;

public class Insert {
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
            String sql = "INSERT INTO students VALUES (2, 'aniket', 'cse', 89.4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO students VALUES (3, 'kaushal', 'ece', 79.4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO students VALUES (4, 'tashu', 'me', 89.7)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO students VALUES (5, 'kavita', 'ece', 93.4)";
            stmt.executeUpdate(sql);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            e.printStackTrace();
        }
        System.out.println("I am here");

    }
}
