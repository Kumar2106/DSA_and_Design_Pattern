package DSA.Mathematic_Advance_Problem;

public class Exactly_3_Divisor {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(noOfDivisor(n));
    }

    public static int noOfDivisor(int n){
        int count =0;
        for(int i=0; i<=n; i++){
            if (threeDivisor(i)) {
                System.out.print(i+" ");
                count++;
            }
        }

        return count;
    }

    public static boolean threeDivisor(int number){
        int sqrt =(int) Math.sqrt(number);
        int sqrt1 = (int) Math.sqrt(sqrt);

        int divisor =0;

        for(int i=2; i<sqrt; i++){
            if (number % i == 0) {
                divisor++;
            }
        }

        if (divisor == 1) {
            return true;
        }

        return false;
    }
}
