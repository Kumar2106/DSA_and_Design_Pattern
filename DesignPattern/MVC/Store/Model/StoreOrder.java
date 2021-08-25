package DesignPattern.MVC.Store.Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Observable;

public class StoreOrder  extends Observable{
    private ArrayList<String> itemList;
    private ArrayList<BigDecimal> pricelist;

    public StoreOrder(){
        itemList = new ArrayList<>();
        pricelist = new ArrayList<>();
    }

    public String getItem(int itemNum){
        return itemList.get(itemNum);
    }

    public String getPrice(int itemNum){
        return pricelist.get(itemNum).toString();
    }

    public ListIterator<String> getItemList(){
        ListIterator<String> itemItr= itemList.listIterator();
        return itemItr;
    }

    public ListIterator<BigDecimal> getPriceList(){
        ListIterator<BigDecimal> priceItr = pricelist.listIterator();
        return priceItr;
    }

    public void deleteItem(int itemNum){
        itemList.remove(itemNum);
        pricelist.remove(itemNum);
        setChanged();
        notifyObservers();
    }

    public void addItem(String name, BigDecimal price){
        itemList.add(name);
        pricelist.add(price);
        setChanged();
        notifyObservers();
    }

    public void changePrice(int itemNum, BigDecimal newPrice){
        pricelist.set(itemNum, newPrice);
        setChanged();
        notifyObservers();
    }
    
}
