package DSA;
public class Recursively_sum_n_numbers {
    public static void main(String[] args) {
        int num = 11;
        System.out.print("The sum is "+ sum(num));
    }

    static int sum(int num){
        if(num == 1){
            return 1;
        }

        return num + sum(num-1);
    }
}
