package HW_16_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/myTestDB";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Connection is opened.");
            statement = connection.createStatement();

            File statementsFile = new File("001_Samples/src/HW_16_02/sql_commands.txt");
            String[] commandList = readCommands(statementsFile);

            for (String command : commandList) {
                statement.execute(command);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                System.out.println("Commands have done!");
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
        boolean closed;
        try {
            if (statement != null) {
                closed = statement.isClosed();
                System.out.println("Connection is closed: " + closed + ".");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String[] readCommands(File file) {
        String resultString = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                resultString += line;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resultString.split("(?<=;)");
    }
}
