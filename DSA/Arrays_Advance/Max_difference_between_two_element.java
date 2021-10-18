package DSA.Arrays_Advance;

public class Max_difference_between_two_element {
    public static void main(String[] args) {
        int arr[] = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiff(arr, arr.length));

    }

    static int maxDiff(int arr[], int n){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (arr[j]> arr[i]) {
                    max = Math.max(max, arr[j]-arr[i]);
                }
            }
        }

        return max;
    }

    static int maxDiffO(int arr[], int n){
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 0;
        right[n-1] = 0;

        int min = arr[0];
        for(int i=1; i<n; i++){
            
        }
    }

}
