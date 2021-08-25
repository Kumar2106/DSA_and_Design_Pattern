package DesignPattern.Template_Method_Pattern.Pasta;

public class Spagetthi_MeatBalls extends PastaDish {

    @Override
    void addPasta() {
        System.out.println("Add spaghetti");
    }

    @Override
    void addSauce() {
        System.out.println("Add tomato Sauce");
    }

    @Override
    void addProtein() {
        System.out.println("Add meatballs");  
    }

    @Override
    void addGarnish() {
       System.out.println("Add Parmesan cheese");
    }
    
}
