package DSA.Sorting_Basic;

public class Insertion_Sort {
    
    public static void main(String[] args) {
        int arr[]={20,5,40,60,10,30};
        int size = arr.length;
        insertion_Sort(arr, size);
        print(arr, size);
    }

    public static void insertion_Sort(int arr[], int size){
        for(int i=1; i<size; i++){
           int key = arr[i];
           int j=i-1;
           while(j>=0 && arr[j] > key){
               arr[j+1] = arr[j];
               j--;
           }

           arr[j+1] = key;
        }
    }

    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
