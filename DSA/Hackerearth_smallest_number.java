package DSA;
import java.util.*;

public class Hackerearth_smallest_number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
    
        while(t-- >0){
            int k = in.nextInt();
    
            int num = createNumber(k);
            
            while( productNum(num) != SumNum(num)  ||  productNum(num) < SumNum(num)  ){
                num++;
            }
    
            System.out.println(num);
    
        }
    }

    static int createNumber(int k){
        int num = 1;

        while(k-- > 1){
            num = (num * 10) +1;
        }

        return num;
    }

    static int productNum(int num){

            return num == 0 ? 1 : num %10 * productNum(num/10);

    }

    static int SumNum(int num){
           return num == 0 ? 0: num%10 + SumNum(num/10);
    }
    
}
