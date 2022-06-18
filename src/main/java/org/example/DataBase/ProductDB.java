package org.example.DataBase;

import org.example.controller.RequestParameter;
import org.example.service.Beer;

import java.sql.*;
import java.util.ArrayList;


public class ProductDB implements ProductDataBase{
    private ArrayList<Beer> List;

    public ArrayList<Beer> getList() {
        return List;
    }

    public void setList(ArrayList<Beer> list) {
        List = list;
    }

    private static final String SELECT_ALL_BEER="SELECT * FROM beer";
    private static final String INSERT_BEER="INSERT INTO beer (nameBeer,container_type,volume_container_beer,type_beer,percentage_of_alcohol_beer,bitterness_of_beer,quantity_of_beer) VALUES(?,?,?,?,?,?,?)";
    @Override
    public ArrayList<Beer> select() throws ClassNotFoundException {
        ArrayList<Beer> products = new ArrayList<Beer>();


        try (Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
             Statement statement = connection.createStatement();
             ResultSet resultSet =statement.executeQuery(ProductDB.SELECT_ALL_BEER))
        {
            Class.forName("com.mysql.jdbc.Driver");
            while (resultSet.next()){
                 String nameBeer=resultSet.getString(2);
                String containerType= resultSet.getString(3);
                 double volumeContainerBeer =resultSet.getDouble(4);
                 String typeBeer=resultSet.getString(5);;
                 double percentageOfAlcoholBeer=resultSet.getDouble(6);;
                 int bitternessOfBeer=resultSet.getInt(7);
                 int  quantityOfBeer=resultSet.getInt(8);
                 Beer product = new Beer(nameBeer,containerType,volumeContainerBeer,typeBeer,percentageOfAlcoholBeer,bitternessOfBeer,quantityOfBeer);
                 products.add(product);
            }

        } catch (SQLException  e ) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public int insert(String nameBeer, String containerType, double volumeContainerBeer,String typeBeer,double percentageOfAlcoholBeer,int bitternessOfBeer,int quantityOfBeer) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(RequestParameter.URL_DB, RequestParameter.USER_DB, RequestParameter.PASSWORD_DB);
            PreparedStatement preparedStatement= connection.prepareStatement(INSERT_BEER)){
                preparedStatement.setString(1,nameBeer);
                preparedStatement.setString(2,containerType);
                preparedStatement.setDouble(3,volumeContainerBeer);
                preparedStatement.setString(4,typeBeer);
                preparedStatement.setDouble(5,percentageOfAlcoholBeer);
                preparedStatement.setInt(6,bitternessOfBeer);
                preparedStatement.setInt(7,quantityOfBeer);
                return preparedStatement.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Beer selectById() {
        return null;
    }


    @Override
    public void deleteById() {

    }
}
