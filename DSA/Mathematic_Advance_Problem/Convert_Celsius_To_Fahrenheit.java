package DSA.Mathematic_Advance_Problem;

public class Convert_Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        int celsius = 50;
        System.out.println(cToF(celsius));
    }

    public static int cToF(double c){
            return (int) (c*1.8) +32;
    }
}
