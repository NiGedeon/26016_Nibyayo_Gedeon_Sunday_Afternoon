/*This program demonstrates how to handle SQLException when working with a database using 
 * JDBC. It connects to a database, executes a SQL query to retrieve data, and processes the 
 * results. If any SQL-related error occurs (e.g., connection failure, invalid query), the 
 * SQLException is caught, and details like the error message, SQL state, and error code are 
 * displayed. The program ensures proper cleanup of database resources (e.g., Connection, 
 * Statement, ResultSet) in the finally block to avoid resource leaks.*/

package exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace with your database URL
        String user = "root"; // Replace with your username
        String password = "password"; // Replace with your password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Establish the database connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the database established successfully!");

            // Step 2: Create a statement
            statement = connection.createStatement();

            // Step 3: Execute a SQL query
            String query = "SELECT * FROM employees"; // Replace with your table name
            resultSet = statement.executeQuery(query);

            // Step 4: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
            }

        } catch (SQLException e) {
            // Handle SQLException
            System.out.println("SQLException caught: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
        } finally {
            // Step 5: Clean up and release resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

