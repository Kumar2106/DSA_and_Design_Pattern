package DSA.Sorting_Basic;

public class Selection_Sort {
    public static void main(String[] args) {
       int arr[] = {10,5,8,20,2,18};
       int size = arr.length; 
      optimisedSelectionSort(arr, size);
       print(arr, size);
    }

    //my own approach
    public static void Selection_sorting(int arr[], int size){
        for(int i=0; i<size; i++){
            int min = Integer.MAX_VALUE;
            int index =-1;
            for(int j=i; j<size; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }

            if (index != -1) {
                swap(arr, i, index);
            }

        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //optimised Select Sort
    public static void optimisedSelectionSort(int arr[], int size){
        for(int i=0; i<size-1; i++){
            int index =i;
            for(int j=i+1; j<size; j++){
                if (arr[j] < arr[index]) {
                    index = j;  
                }
            }
            swap(arr, i, index);
          
        }
    }
}
