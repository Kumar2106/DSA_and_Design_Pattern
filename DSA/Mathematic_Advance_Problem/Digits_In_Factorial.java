package DSA.Mathematic_Advance_Problem;

public class Digits_In_Factorial {
    public static void main(String[] args) {
        int num = 120;
        System.out.println(digitsInFactorial(num));
    }

    public static int digitsInFactorial(int num){
            if (num==0) {
                return 0;
            }else if (num == 1) {
                return 1;
            }

            double digits =0;

            for(int i=2; i<=num; i++){
                digits += Math.log10(i);
            }

        return (int) Math.floor(digits) +1;
    }
}
