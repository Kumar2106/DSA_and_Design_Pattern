package DSA;

import java.util.HashMap;

public class Hashing_for_pair_2 {
    public static void main(String[] args) {
        int n =11;
        int arr[] = {1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 2;
        System.out.println(isPairExist(n, arr, sum));
    }

    public static int isPairExist(int n, int arr[], int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<n; i++){
            int num = sum -arr[i];
            if (num == arr[i]) {
                if (map.get(arr[i])>1) {
                    return 1;
                }else{
                    return 0;
                }
            }

            if (map.containsKey(num)) {
                return 1;
            }
        }

        return 0;
    }
}
