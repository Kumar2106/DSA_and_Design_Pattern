package DSA.Arrays_Advance;

public class Max_and_second_max {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        max_second_max(arr);
    }

    public static void max_second_max(int arr[]){
        int n = arr.length;
        int max = 0;

        for(int i=0; i<n; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondmax = 0;
        for(int i=0; i<n; i++){
            if (secondmax <arr[i] && arr[i]<max) {
                secondmax = arr[i];
            }
        }
        
        if (max == secondmax) {
            secondmax = -1;
        }

        System.out.println("Max is "+max +" SecondMax is "+ secondmax);
    }
}
