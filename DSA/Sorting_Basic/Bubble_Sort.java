package DSA.Sorting_Basic;

//bubble sort is stable sorting algorithm
public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={10,8,20,5};
        sort(arr, arr.length);
        print(arr, arr.length);

    }

    public static void sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }

    public static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //optimized version of the bubble sort
    public static void oSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            boolean swapped = false;

            for(int j=0; j<n-i-1; j++){
                if (arr[j]> arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
}
