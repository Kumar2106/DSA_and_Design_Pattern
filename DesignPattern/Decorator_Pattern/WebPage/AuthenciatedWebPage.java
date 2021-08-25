package DesignPattern.Decorator_Pattern.WebPage;

public class AuthenciatedWebPage extends WebPageDecorator {

    public AuthenciatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser(){
        System.out.println("Authenticating User");
    }

    public  void display() {
        super.display();
        this.authenticateUser();
    }
    
}
