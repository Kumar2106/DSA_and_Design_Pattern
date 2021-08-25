package DesignPattern.Template_Method_Pattern.Pasta;

public class MainProgram {
   public static void main(String[] args) {
       System.out.println("Preparing PenneAlfredo");
       PenneAlfredo alfredo = new PenneAlfredo();
       alfredo.makeRecipe();
       System.out.println("");
       System.out.println("Preparing Spagetthi MeatBalls");
       Spagetthi_MeatBalls spagetthi_MeatBalls = new Spagetthi_MeatBalls();
       spagetthi_MeatBalls.makeRecipe();
   }
    
}
