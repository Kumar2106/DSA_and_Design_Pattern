package DesignPattern.Proxy_Pattern.Online_Retail_Store;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class OrderFulFillment  implements Iorder{
    private List<WareHouse> WareHouse;

    OrderFulFillment(){
        WareHouse = new ArrayList<>();
    }

    @Override
    public void fullfillOrder(Order order) {
        for(Item item: order.itemList){
            for(int i=0; i<WareHouse.size(); i++){
                WareHouse curr = WareHouse.get(i);
                Hashtable<String,Integer> currStock = curr.stock;
                if (currStock.contains(item)) {
                    curr.fullfillOrder(new Order(item));
                    break;
                }
            }
        }
        
    }


    
}
