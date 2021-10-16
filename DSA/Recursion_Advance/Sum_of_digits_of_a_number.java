package DSA.Recursion_Advance;

public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {
       System.out.println(sum_Of_Digit(0, 111)); 
    }
    
    public static int sum_Of_Digit(int sum, int num){
        if (num ==0) {
            return sum;
        }

        sum+= num %10;
        num/=10;
       
       
       return sum_Of_Digit(sum, num);

    }
}
