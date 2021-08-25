package DesignPattern.Proxy_Pattern.Online_Retail_Store;

import java.util.ArrayList;

public class Order {
    ArrayList<Item> itemList = new ArrayList<>();
    Order(Item item){
        itemList.add(item);
    }
}
