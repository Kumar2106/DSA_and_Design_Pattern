package DSA.Sorting_Basic;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting_even_odd {
    public static void main(String[] args) {
        Integer arr[] ={5,20,10,3,12};
        Arrays.sort(arr, new MyCmp());
        System.out.println(Arrays.toString(arr));
    }

    public static class MyCmp implements Comparator<Integer>{

        @Override
        public int compare(Integer a, Integer b) {
            // TODO Auto-generated method stub
            return a%2 - b%2;
        }
        
    }
}
