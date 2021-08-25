package DesignPattern;
public class Knife_Order {
    public static void main(String[] args) {
        
        KnifeFactory factory = new KnifeFactory();
        KnifeStore store = new KnifeStore(factory);
        Knife knife = store.orderKnife("steak");

    }

    public static class KnifeStore{
        private KnifeFactory factory;

        public KnifeStore(KnifeFactory knifeFactory){
            this.factory = knifeFactory;
        }
        public Knife orderKnife(String KnifeType){
            Knife knife;
            //use the create method in the factory
            knife = factory.createKnife(KnifeType);

            //prepare the knife
            knife.sharpen();
            knife.polish();
            knife.packing();

            return knife;
        }
    }

    public static class KnifeFactory{
        public Knife createKnife(String KnifeType){
            Knife knife = null;

            // create knife object
            if(KnifeType.equals("steak")){
                knife = new SteakKnife();
            }
            else if(KnifeType.equals("chefs")){
                knife = new ChefsKnife();
            }

            return knife;
        }
    }

    //class for the knife
    public class Knife{

        //method to sharpen the knife
        public void sharpen(){
            System.out.println("Sharpening the Knife");
        }
        
        //method to polish the knife
        public void polish(){
            System.out.println("Polishing the knife");
        }

        //method to pack the knife
        public void packing(){
            System.out.println("Packing the knife");
        }

    }

    //class for the SteakKnife
    public  class SteakKnife extends Knife{
       SteakKnife(){
           new Knife();
       }
    }

    //class for the ChefKnife
    public  class ChefsKnife extends Knife{
        ChefsKnife(){
            new Knife();
        }
    }
}


