package DSA;
import java.math.BigInteger;
import java.util.*;

public class Factorial_Of_a_large_number {
    
    public static void main(String[] args) {
        ArrayList<Integer> out = factorial(100);
        for (Integer integer : out) {
            System.out.print(integer);
        }
    }
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        result.add(1);
        
        for(int i=2; i<=N; i++){
            multiply(result, i);
        }
        
        Collections.reverse(result);
        
        return result;
    }
    
    static void multiply(ArrayList<Integer> arr, int i){
        int carry =0;
        
        for(int j=0; j<arr.size(); j++){
            int temp = arr.get(j);
            temp = (temp * i) + carry;
            arr.set(j, temp%10);
            carry = carry /10;
        }
        
        while(carry != 0){
            System.out.println("Inside the while carry");
            arr.add(carry % 10);
            carry = carry /10;
        }
    }
}
