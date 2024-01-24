package com.itvdn.jdbcandhibernate.ex002_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Asus on 09.10.2017.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/carsshop";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
         registerDriver();

        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            statement.execute("INSERT INTO cars(car_id, mark, model, price) VALUES (4, 1, '911 turbo s', 20000)");

            int res = statement.executeUpdate("UPDATE clients SET age = age + 1 WHERE name = 'Jeremy'");
            System.out.println(res);

            statement.addBatch("INSERT INTO cars(mark, model, price) VALUES (3, 'a6', 4000)");
            statement.addBatch("INSERT INTO cars(mark, model, price) VALUES (2, 'Cayenne turbo', 14000)");
            statement.addBatch("INSERT INTO cars(mark, model, price) VALUES (1, 'S7', 100000)");

            statement.executeBatch();

            boolean closed = statement.isClosed();
            System.out.println(closed);


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
