package DSA;
import java.util.*;

class Hello {
    public static void main(String[] args){
        String act = "edsab";
       System.out.println(act.charAt(0)-'a');
        

    }

    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}