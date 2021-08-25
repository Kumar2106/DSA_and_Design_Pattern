package DSA;

import java.util.Arrays;

public class Majority_element {
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {1,2,3};
        System.out.println(majority(arr, n));
    }

    public static int majority(int arr[], int n){
        Arrays.sort(arr);
        int count = 1;
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if (count >n/2) {
                    return arr[i];
                }
            }else{
                count =1;
            }
        }
        return -1;
    }
}
