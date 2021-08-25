package DSA;

import java.util.HashSet;

public class Hashin_for_pair {
    public static void main(String[] args) {
        int N = 10;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 2;
        System.out.println(isPairExist(N, arr, sum));
    }

    public static int isPairExist(int n, int arr[], int sum){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        for(int i=0; i<n; i++){
            int num = sum - arr[i];
            if (num == arr[i]) {
                return 0;
            }

            if (set.contains(num)) {
                return 1;
            }
        }
        

        return 0;
    }
}
