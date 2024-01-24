package HW_16_06;

import java.sql.*;

public class Main {

    //CREATE DATABASE IF NOT EXISTS myTestDB;
    //USE myTestDB;
    //CREATE TABLE cars (
    //id integer NOT NULL AUTO_INCREMENT,
    //mark varchar(255),
    //model varchar(255),
    //color varchar(255),
    //max_speed integer,
    //PRIMARY KEY (id)
    //);

    private static final String URL = "jdbc:mysql://localhost:3306/myTestDB";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "0000";

    private static final String INSERT_NEW = "INSERT INTO cars(mark, model, color, max_speed) "
            + " VALUES(?,?,?,?)";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(INSERT_NEW);

            statement.setString(1, "Toyota");
            statement.setString(2, "Corolla");
            statement.setString(3, "White");
            statement.setInt(4, 220);
            statement.execute();

            statement.setString(1, "Mercedes");
            statement.setString(2, "W206");
            statement.setString(3, "Black");
            statement.setInt(4, 270);
            statement.execute();

            statement.setString(1, "Fiat");
            statement.setString(2, "500");
            statement.setString(3, "Red");
            statement.setInt(4, 180);
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
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
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
