package DesignPattern.Proxy_Pattern.Online_Retail_Store;

import java.util.Hashtable;


public class WareHouse implements Iorder {
    public Hashtable<String,Integer> stock;
    private String address;

    WareHouse(){
        stock = new Hashtable<>();
    }

    @Override
    public void fullfillOrder(Order order) {
        for(Item item: order.itemList){
            this.stock.replace(item.sku,stock.get(item)-1);
            //process the order for shipment and delivery
        }
        
    }

    public int currentInventory(Item item){
        if(stock.containsKey(item.sku)){
            return stock.get(item.sku).intValue();
        }
        return 0;
    }
    
}
