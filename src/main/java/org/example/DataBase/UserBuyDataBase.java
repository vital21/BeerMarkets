package org.example.DataBase;

import org.example.service.ProductBuy;

import java.util.ArrayList;

public interface UserBuyDataBase {
    void insertUserBuy(int userId, ArrayList<ProductBuy> productBuy);
}
