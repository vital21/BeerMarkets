package org.example.repository;

import java.sql.*;

public class BeerRepository {
    private static final String url = "jdbc:mysql://localhost:3306/test_code_1";
    private static final String user = "root";
    public static final String password = "21346578Vvw";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public void getSql() {

        String query = "SELECT nameBeer FROM beer";
        try (Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query))
        {

            while (resultSet.next()) {
                String count = resultSet.getString(1);
                System.out.println("Name beer is " + count);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}
