package org.example.input;

import java.sql.*;

public class DataBaseConnect {
    private static final String url = "jdbc:mysql://localhost:3306/test_code_1";
    private static final String user = "root";
    public static final String password = "21346578Vvw";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public void registrationUserDataBase(String login,String password,String email) throws ClassNotFoundException {
        String token="asd";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, user, this.password);
             Statement statement = connection.createStatement())
        {
           // int query = statement.executeUpdate("INSERT users (username,password,gmail,token) VALUES ('sdfg','sdfg','sdfsg','dfgsdfg');");
          int query = statement.executeUpdate("INSERT users (username,password,gmail,token) VALUES ('sdfgфdsdf','sdfsdfsdfg','sdfssdfsdfg','dfsdfsdsdfg');");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    }

