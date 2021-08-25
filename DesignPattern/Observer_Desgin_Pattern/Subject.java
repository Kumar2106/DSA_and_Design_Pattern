package DesignPattern.Observer_Desgin_Pattern;

import java.util.ArrayList;

/**
 * Subject
 */
public class Subject  {
    private ArrayList<Observer> observers = new ArrayList();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void notify1(){
        for(Observer observer: observers){
            observer.update();
        }
    }
    
}