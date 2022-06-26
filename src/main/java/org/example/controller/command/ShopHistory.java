package org.example.controller.command;

import org.example.DataBase.ProductDB;
import org.example.DataBase.UserBuyDb;
import org.example.controller.CustomCommand;
import org.example.service.Beer;
import org.example.service.ProductBuy;
import org.example.service.UserBuy;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShopHistory implements CustomCommand  {
    @Override
    public String executeCommand(HttpServletRequest request) throws ClassNotFoundException {
        ServletContext servletContext= request.getServletContext();
        int idUser= (int) servletContext.getAttribute("idUser");
        ArrayList<UserBuy> userBuys=new ArrayList<>();
        UserBuyDb userBuyDb = new UserBuyDb();
        ProductDB productDB=new ProductDB();
        userBuys=userBuyDb.selectUserBuy(idUser);
        int size=userBuys.size();
        ArrayList<Beer> beers=new ArrayList<>();
        for(int i=0;i<size;i++){
            Beer beer=productDB.selectById(userBuys.get(i).getProductId());
            beers.add(beer);
        }
        return null;
    }
}
