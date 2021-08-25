package DSA;

import java.util.HashMap;
import java.util.Map;

public class Count_non_repeated_elments {
    public static void main(String[] args) {
        int n = 5;
        int arr[]={10,20,30,40,10};
        System.out.println("Size of the non repeated elements is "+ count(arr,n));

    }

    public static int count(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int count =0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if (e.getValue() == 1) {
                count++;
            }
        }
       
        return count;
    }
}
