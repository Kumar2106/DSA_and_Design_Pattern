package DesignPattern.Decorator_Pattern.WebPage;

public abstract class WebPageDecorator implements WebPage {
    protected WebPage page;
    public WebPageDecorator (WebPage webPage){
        this.page = webPage;
    }

    public void display(){
        this.page.display();
    }
}
