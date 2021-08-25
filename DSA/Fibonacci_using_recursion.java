package DSA;
/**
 * Fibonacci_using_recursion
 */
public class Fibonacci_using_recursion {

    public static void main(String[] args) {
        int n =20;
        System.out.println("The nth fibonacci number is "+nthFib(n));
    }

    static int nthFib(int num){
        if (num==1 || num==2) {
            return 1;
        }

        return nthFib(num-1)+nthFib(num-2);
    }
}