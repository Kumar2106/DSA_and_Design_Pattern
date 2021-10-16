package DSA.Recursion_Advance;

public class Count_total_digit_in_a_number {
    public static void main(String[] args) {
        System.out.println(count(0, 4567));
    }

    public static int count(int count,int num){

        if (num == 0) {
            return count;
        }

        
            count++;
            num/=10;
        

        return count(count, num);
    }
}
