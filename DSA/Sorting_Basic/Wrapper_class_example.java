package DSA.Sorting_Basic;

import java.util.Arrays;
import java.util.Collections;

public class Wrapper_class_example {
    public static void main(String[] args) {
        Integer arr[]={5,20,10,12};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
