package org.example;

import org.example.DataBase.ProductDB;
import org.example.repository.BeerRepository;
import org.example.service.Beer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

       // BeerRepository beerRepository = new BeerRepository();
       // beerRepository.getSql();
       // beerRepository.registrationUserDataBase("vital","asdaasdasd","dedwed");
        ProductDB product=new ProductDB();
        ArrayList<Beer> products = product.select();
    }
}