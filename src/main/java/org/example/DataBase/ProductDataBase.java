package org.example.DataBase;

import org.example.service.Beer;

import java.util.ArrayList;

public interface ProductDataBase {
   ArrayList<Beer> select() throws ClassNotFoundException;
    Beer selectById();
    int insert(String nameBeer, String containerType, double volumeContainerBeer,String typeBeer,double percentageOfAlcoholBeer,int bitternessOfBeer,int quantityOfBeer);
    void deleteById();
}
