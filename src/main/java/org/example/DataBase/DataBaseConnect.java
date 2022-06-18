package org.example.DataBase;

import org.example.controller.RequestParameter;

import java.io.IOException;
import java.sql.*;

public class DataBaseConnect {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public void ViewAllProducts() throws ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
             Statement statement = connection.createStatement())
        {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
