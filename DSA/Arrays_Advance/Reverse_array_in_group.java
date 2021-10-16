package DSA.Arrays_Advance;

import java.util.ArrayList;

public class Reverse_array_in_group {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ArrayList<Integer> input = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            input.add(arr[i]);
        }

        int n=5, k=3;
        reverse(input, 0, n);
        print(input);

    }

    public static void print(ArrayList<Integer> input){
        for(int i=0; i<input.size(); i++){
            System.out.print(input.get(i)+" ");
        }
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end){
        for(int i=start; i<end; i++){
            int temp = arr.get(i);
            arr.set(i,arr.get(end-i-1));
            arr.set(end-i-1, temp);
            
        }
    }
}
