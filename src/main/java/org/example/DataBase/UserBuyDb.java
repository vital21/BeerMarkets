package org.example.DataBase;

import org.example.controller.RequestParameter;
import org.example.service.Beer;
import org.example.service.ProductBuy;
import org.example.service.UserBuy;

import java.sql.*;
import java.util.ArrayList;

public class UserBuyDb implements UserBuyDataBase{
    private static final String INSERT_BUY_IN_DB="INSERT INTO user_buy (user_id,beer_id,quantity,date) VALUES(?,?,?,?)";
    private static final String SELECT_USER_BUY="SELECT * FROM user_buy WHERE user_id=?";
    @Override
    public void insertUserBuy(int userId, ArrayList<ProductBuy> productBuy) {
        try {
            int size=productBuy.size();
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
                 PreparedStatement preparedStatement= connection.prepareStatement(INSERT_BUY_IN_DB)){
                java.sql.Date date = new Date(new java.util.Date().getTime());
                for(int i=0;i<size;i++) {
                    preparedStatement.setInt(1, userId);
                    preparedStatement.setInt(2,productBuy.get(i).getId());
                    preparedStatement.setInt(3,productBuy.get(i).getQuantity());
                    preparedStatement.setDate(4, date);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<UserBuy> selectUserBuy(int idUser){
        ArrayList<UserBuy>userBuys=new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BUY)){
            Class.forName("com.mysql.jdbc.Driver");
            preparedStatement.setInt(1,idUser);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                int userId=resultSet.getInt(1);
                int beerId=resultSet.getInt(2);
                int quantity=resultSet.getInt(3);
                String date= resultSet.getString(4);
               UserBuy product = new UserBuy(userId,beerId,quantity,date);
               userBuys.add(product);
            }


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return userBuys;
    }
}
