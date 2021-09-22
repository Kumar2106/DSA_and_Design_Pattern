package DSA.Mathematic_Advance_Problem;

public class Factorial_of_a_number {
    public static void main(String[] args) {
        System.out.println("Factorial "+factorial(4));
    }

    public static int factorial(int num){
        int result = 1;
        int i=1;
        while (i<=num) {
            result= result*i;
            i++;
        }

        return result;
    }
}


