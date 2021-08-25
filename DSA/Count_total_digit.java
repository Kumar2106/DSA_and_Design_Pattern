package DSA;
public class Count_total_digit {
    public static void main(String[] args) {
        int n = 100000000;
        int sum =0;
        System.out.print("Total number of digit in the number is"+count(n));
    }

    //will take number and give total number of digits in a number
    static int count(int N){
        if(N==0){
            return 0;
        }

       return 1+count(N/10);
    }
}
