package DSA.Arrays_Advance;

import java.util.Arrays;

public class Mean_and_median {
    public static void main(String[] args) {
        int arr[]={1,2,19,28,5,6};
        int size = arr.length;
        mean_and_median(arr, size);
    }

    public static void mean_and_median(int arr[], int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += arr[i];
        }
        System.out.println("Mean is "+ sum/size);

        Arrays.sort(arr);

        if (size %2 == 1) {
            System.out.println("Median is "+arr[size/2]);
        }else{
            int num1 = arr[size/2];
            int num2 = arr[(size/2)-1];
            System.out.println("Median is "+ Math.floor((num1+num2)/2));
        }
    }
}
