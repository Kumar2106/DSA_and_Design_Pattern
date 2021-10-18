package DSA.Searching_Advance;

import java.util.ArrayList;

public class Sum_array_with_given_sum {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int N = 10;
        int S = 15;
        ArrayList<Integer> result = subarraySum(A, N, S);
        for(Integer i: result){
            System.out.print(i+" ");
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<>();
       for(int i=0; i<n; i++){
           int sum =arr[i];
           for(int j=i+1; j<n; j++){
                sum+=arr[j];
               if (sum == s) {
                   result.add(i+1);
                   result.add(j+1);
                   return result;
               }

               if (sum >s) {
                  break; 
               }
           }
       }

       return result;
    }
}
