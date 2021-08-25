package DesignPattern.MVC.Store.Controller;

import java.math.BigDecimal;

import DesignPattern.MVC.Store.Model.StoreOrder;
import DesignPattern.MVC.Store.View.OrderView;

public class OrderController {
    private  StoreOrder storeOrder;
    private OrderView orderView;

    public OrderController(StoreOrder storeOrder, OrderView orderView){
        this.storeOrder = storeOrder;
        this.orderView = orderView;
    }

    public void deleteItem(int itemNum){
        storeOrder.deleteItem(itemNum);
    }

    public void changePrice(int itemNum, BigDecimal newPrice){
        storeOrder.changePrice(itemNum, newPrice);
    }
}
