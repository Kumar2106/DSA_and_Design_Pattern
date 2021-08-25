package DesignPattern.Decorator_Pattern.WebPage;

public class MainProgram {
    public static void main(String[] args) {
        WebPage page = new BasicWebPage();
        page = new AuthorizedWebPage(page);
        page = new AuthenciatedWebPage(page);
        page.display();
    }
}
