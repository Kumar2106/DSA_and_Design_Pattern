package DSA.Sorting_Basic_Problem;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};
        Qsort(arr, 0, arr.length-1);
        print(arr, arr.length);

        int arr1[]={2, 1, 6, 10, 4, 1, 3, 9, 7};
        Qsort(arr1, 0,arr1.length-1);
        print(arr1, arr1.length);
    }

    public static void Qsort(int arr[], int l, int h){
        if (l<h) {
            int p=LPartition(arr, l, h);
            Qsort(arr, l, p-1);
            Qsort(arr, p+1, h);
        }
    }

    public static int LPartition(int arr[], int l, int h){
        int pivot = arr[h];
        int i=l-1;
        int j;
        for(j=l; j<h; j++){
            if (arr[j] <pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, j);
        return (i+1);
    }

    //utility function to swap the element of the array
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
    }
}
