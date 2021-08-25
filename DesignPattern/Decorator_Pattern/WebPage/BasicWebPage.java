package DesignPattern.Decorator_Pattern.WebPage;

public class BasicWebPage  implements WebPage{
    public String HTML="";
    public String StyleSheet="";
    public String script="";

    @Override
    public void display() {
        System.out.println("Rendering the html element with stylesheet and having script");
        
    }

}
