package DesignPattern.Template_Method_Pattern.Pasta;

public abstract class PastaDish {
    public final void makeRecipe(){
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }
    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();
    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void cookPasta(){
        System.out.println("cooking the Pasta");
    }

    private void drainAndPlate(){
        System.out.println("Draining the plate");
    }
}
