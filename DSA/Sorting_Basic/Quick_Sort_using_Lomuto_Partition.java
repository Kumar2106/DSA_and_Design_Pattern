package DSA.Sorting_Basic;

public class Quick_Sort_using_Lomuto_Partition {
    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        Quick_Sort(arr, 0, arr.length-1);
        print(arr, arr.length);
    }

    //quick sort function
    public static void Quick_Sort(int arr[], int l, int h){
        if (l<h) {
            int p = partition(arr, l, h);
            Quick_Sort(arr, l, p-1);
            Quick_Sort(arr, p+1, h);
        }
    }

    //swapping the ith and jth element
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }

    //this function is going to print all the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //this function is causing the partition
    public static int partition(int arr[], int l, int h){
        int i=l-1; 
        int pivot = arr[h];

        for(int j=l; j<h-1; j++){
            if (arr[j]<pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }
}
