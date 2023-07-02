package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectAndStore {
    static final String DB_URL = "jdbc:mysql://localhost/jdbc_test";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args) {

        try
        {
            ArrayList<Student> students = new ArrayList<>();
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "select roll, name, dept, marks from students";
            ResultSet rs = stmt.executeQuery(sql);
            // Extract data from result set
            while (rs.next()) {
                Student student = new Student();
                student.name = rs.getString("name");
                student.roll =  rs.getInt("roll");
                student.dept = rs.getString("dept");
                student.marks = rs.getFloat("marks");
                students.add(student);

            }
            System.out.println(students);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("I am here");

    }
}

class Student {
    String name;
    int roll;
    String dept;
    float marks;

    @Override
    public String toString() {
        return "name = " + name + " roll = " + roll + " dept = " + dept + " marks = " + marks;
    }
}
