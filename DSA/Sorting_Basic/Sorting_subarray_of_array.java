package DSA.Sorting_Basic;

import java.util.Arrays;

public class Sorting_subarray_of_array {
    public static void main(String[] args) {
        int arr[]={5,30,20,10,8};

        //1th index element will be included and 4th index element will not be included
        //[1,4)
        Arrays.sort(arr,1,4);

        System.out.print(Arrays.toString(arr));
    }
}
