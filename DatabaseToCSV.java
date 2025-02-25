import java.io.*;
import java.sql.*;

public class DatabaseToCSV {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "password";
        String csvFile = "employee_report.csv";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
             FileWriter writer = new FileWriter(csvFile)) {

            writer.append("Employee ID,Name,Department,Salary\n");

            while (rs.next()) {
                writer.append(rs.getInt("id") + "," +
                              rs.getString("name") + "," +
                              rs.getString("department") + "," +
                              rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV report generated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
