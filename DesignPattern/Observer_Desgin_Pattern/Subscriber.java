package DesignPattern.Observer_Desgin_Pattern;

public class Subscriber  implements Observer{

    @Override
    public void update() {
       System.out.println("Getting the latest blog content");
    }
    
}
