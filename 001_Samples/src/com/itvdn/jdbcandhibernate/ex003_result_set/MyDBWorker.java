package com.itvdn.jdbcandhibernate.ex003_result_set;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDBWorker {
    private final String URL = "jdbc:mysql://localhost:3306/carsshop";
    private final String LOGIN = "root";
    private final String PASSWORD = "0000";



    public MyDBWorker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<MyCustomer> getAllCustomers() {
        Connection connection = null;
        Statement statement = null;
        List<MyCustomer> customers = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

            while (resultSet.next()) {
                int id = resultSet.getInt("cust_id");
                String name = resultSet.getString("cust_name");
                String phone = resultSet.getString("cust_tel_number");
                MyCustomer cust = new MyCustomer(id, name, phone);
                customers.add(cust);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return customers;
    }
}
