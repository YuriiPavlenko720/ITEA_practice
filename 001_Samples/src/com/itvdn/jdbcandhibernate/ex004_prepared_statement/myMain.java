package com.itvdn.jdbcandhibernate.ex004_prepared_statement;

import java.sql.*;


public class myMain {
    private static final String URL = "jdbc:mysql://localhost:3306/carsshop";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "0000";

    private static final String INSER_NEW = "INSERT INTO customers (cust_id, cust_name, cust_tel_number) "
            + " VALUES(?,?,?)";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(INSER_NEW);

            statement.setInt(1, 7);
            statement.setString(2, "Olga");
            statement.setString(3, "8989898");


            statement.execute();

            statement.setInt(1, 8);
            statement.setString(2, "Olga");
            statement.setString(3, "8989898");

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }


    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
