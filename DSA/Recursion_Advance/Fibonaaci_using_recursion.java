package DSA.Recursion_Advance;

public class Fibonaaci_using_recursion {
    public static void main(String[] args) {
        System.out.println(nth(20));
    }

    public static int nth(int n){
        if (n ==1 || n==2) {
            return 1;
        }

        return nth(n-1)+nth(n-2);
    }
}
