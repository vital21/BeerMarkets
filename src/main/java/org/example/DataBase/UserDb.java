package org.example.DataBase;

import org.example.controller.RequestParameter;
import org.example.service.Beer;

import java.sql.*;

public class UserDb implements UserDataBase{
    private static final String EDIT_ID_BY_NAME="SELECT id FROM users WHERE username=?";
    @Override
    public int selectIdUserByName(String name) {
        int id = 0;
        try (Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_ID_BY_NAME)) {
            Class.forName("com.mysql.jdbc.Driver");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                return id;
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return id;
    }
}
