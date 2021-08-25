/**
 * Singleton
 */
public class Singleton {

    private static Singleton unique =null;

    private Singleton(){

    }

    private static Singleton getInstance(){
        if (unique == null) {
            System.out.println("Creating new Instance");
            unique = new Singleton();
        }
        else{
            System.out.println("Returning the already created instance");
        }

        return unique;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
    }
}


