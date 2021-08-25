package DSA.Sorting_Basic_Problem;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr1[]={4,1,3,9,7};
        sort(arr1, arr1.length);
        print(arr1, arr1.length);

        System.out.println("");

        int arr[]={10,9,8,7,6,5,4,3,2,1};
        sort(arr, arr.length);
        print(arr, arr.length);
        
    }

    public static void sort(int arr[],int size){
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    //utility function to print the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //utility functio to swap the element of the array
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
