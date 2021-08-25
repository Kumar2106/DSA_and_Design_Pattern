package DSA;
public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        System.out.print(Integer.MAX_VALUE);
        
        System.out.print("The sum of all digits in the number is"+sum_of_digit(num));
    }

    static int sum_of_digit(int num){
        if (num==0) {
            return 0;
        }
        return num%10+ sum_of_digit(num/10);

    }
}
