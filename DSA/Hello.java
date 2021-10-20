package DSA;
import java.util.*;

class Hello {
    public static void main(String[] args){
       int n = 2;
       int arr[] = {1,2};
       System.out.println(sum(arr, n));
    }

    public static int sum(int arr[], int n){
	    int sum = 0;
	    
	    for(int i=0; i<n; i++){
	        int internal[] = new int[n-i];
            int index =0;
            internal[index++] = arr[i];
            for(int j=i; j<n; j++){
                internal[index++] = Math.max(internal[index-1], arr[j]);
            }

            int currsum [] = new int[n-i];
            index =0;
            currsum[index] = internal[index];
            index++;
            for(int j=i; j<n; j++){
                currsum[index++] = currsum[index-1]+internal[index];
            }

            for(int j=0; j<currsum.length; j++){
                sum+=currsum[j];
            }
	    }
	    
	    return sum;
	}

}