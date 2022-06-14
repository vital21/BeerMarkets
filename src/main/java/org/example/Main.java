package org.example;

import org.example.repository.BeerRepository;

public class Main {
    public static void main(String[] args) {

        BeerRepository beerRepository = new BeerRepository();
        beerRepository.getSql();
    }
}