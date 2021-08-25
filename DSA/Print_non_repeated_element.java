package DSA;

import java.util.HashMap;
import java.util.Map;

public class Print_non_repeated_element {
    
    public static void main(String[] args) {
        int n=5;
        int arr[] = {10,20,40,30,10};
        print(arr, n);
    }

    static void print(int arr[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if (e.getValue() == 1) {
                System.out.print(e.getKey()+" ");
            }
        }
    }
}
