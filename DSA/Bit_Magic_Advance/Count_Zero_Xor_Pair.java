package DSA.Bit_Magic_Advance;

import java.util.Arrays;

public class Count_Zero_Xor_Pair {
    public static void main(String[] args) {
        int arr[]={10,8,14,13,11,16,16,13,1,6,3,11,14,7};
        int n = arr.length;
        System.out.println(calculate(arr, n));

    }

    public void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static long calculate (int arr[], int n) {
        Arrays.sort(arr);
        
        System.out.println("After sorting"+arr);
        int count =1;
        int res =0;
        
        for(int i=1; i<n; i++){
            if(arr[i-1] == arr[i]){
                count++;
            }else{
                res = res+ (count*(count-1))/2;
                count =1;
            }
        }
        
        if(count != 1 && res ==0){
            res = res +(count*(count-1)/2);
        }
        
        return res;
    }
}
