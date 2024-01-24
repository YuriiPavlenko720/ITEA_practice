package HW_16_05;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB_Employees {

    private final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB";
    private final String LOGIN = "root";
    private final String PASSWORD = "0000";

    public DB_Employees() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployees() {
        Connection connection = null;
        Statement statement = null;
        List<Employee> allEmployees = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT " +
                            "id, emp_name, emp_phone_number, " +
                            "emp_marital_status, emp_birth, " +
                            "emp_address, emp_position, emp_salary " +
                            "FROM employees\n" +
                    "JOIN personal\n" +
                    "ON employees.id = personal.emp_id\n" +
                    "JOIN staff\n" +
                    "ON employees.id = staff.emp_id;");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String emp_name = resultSet.getString("emp_name");
                String emp_phone_number = resultSet.getString("emp_phone_number");
                String emp_marital_status = resultSet.getString("emp_marital_status");
                Date emp_birth = resultSet.getDate("emp_birth");
                String emp_address = resultSet.getString("emp_address");
                String emp_position = resultSet.getString("emp_position");
                int emp_salary = resultSet.getInt("emp_salary");


                Employee emp = new Employee(id, emp_name, emp_phone_number,
                        emp_marital_status, emp_birth, emp_address, emp_position, emp_salary);
                allEmployees.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return allEmployees;
    }
}
