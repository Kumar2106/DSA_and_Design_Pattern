package DSA.Sorting_Basic_Problem;

import java.util.Arrays;

public class Count_the_number_of_possible_triangle {
    public static void main(String[] args) {
        int arr[]={6,4,9,7,8};
        System.out.print("The number of triangle possible "+ optimised_noTriangle(arr, arr.length));

    }

    //bruteforce approach
    public static int noTriangle(int arr[], int size){
        int count =0;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
               for(int k=j+1; k<size; k++){
                  if(arr[i]<arr[j]+arr[k] && arr[j]< arr[i]+arr[k] && arr[k]<arr[i]+arr[j]){
                      count++;
                  }
               }
            }
        }
       
        return count;
    }

    //optimised Approach
    public static int optimised_noTriangle(int arr[], int size){
        int count =0;
        Arrays.sort(arr);

        for(int i=size-1; i>=0; i--){
            int l=0,r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=r-l;
                    r--;
                }else{
                    l++;
                }
            }
        }
        return count;
    }
}
