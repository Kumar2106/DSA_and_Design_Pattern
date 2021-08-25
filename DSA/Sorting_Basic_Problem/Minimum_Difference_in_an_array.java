package DSA.Sorting_Basic_Problem;


import java.util.Arrays;

public class Minimum_Difference_in_an_array {
    public static void main(String[] args) {
        int arr[]={2,4,5,9,7};
        System.out.print("Output of the bruteforce Approach  ");
        System.out.println(BruteForce_Min(arr, arr.length));
        System.out.print("Output of the optimized Approach  ");
        System.out.print(optimised_Min(arr, arr.length));
    }

    //BruteForce approach
    public static int BruteForce_Min(int arr[], int size){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                min = Math.min(min, Math.abs(arr[i]-arr[j]));
            }
        }

        return min;
    }

    //optimised solution
    public static int optimised_Min(int arr[], int size){
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i=1; i<size; i++){
            min=Math.min(min, arr[i]-arr[i-1]);
        }
        return min;
    }

    
}
