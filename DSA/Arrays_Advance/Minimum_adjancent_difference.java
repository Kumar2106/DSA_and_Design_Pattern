package DSA.Arrays_Advance;

public class Minimum_adjancent_difference {
    public static void main(String[] args) {
        int arr[] = {10,-3,-4,7,6,5,-4,-1};
        int size = arr.length;
        System.out.println(minimum(arr, size));
    }

    public static int minimum(int arr[], int size){
        int min = Math.abs(arr[0]-arr[size-1]);
        for(int i=0; i<size-1; i++){
            min = Math.min(min, Math.abs(arr[i]-arr[i+1]));
        }
        return min;
    }
}
