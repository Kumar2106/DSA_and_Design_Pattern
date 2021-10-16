package DSA.Arrays_Advance;

import java.util.ArrayList;

public class Leaders_in_a_array {
    public static void main(String[] args) {
       int A[] = {1,2,3,4,0};
       int n = A.length;
       ArrayList<Integer> result = leaders(A, n);
       System.out.println(result);
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            boolean isLarge = true;

            for(int j=i+1; j<n; j++){
                if (arr[i] < arr[j]) {
                    isLarge = false;
                }
            }

            if (isLarge) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
