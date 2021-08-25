package DSA.Sorting_Basic_Problem;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={4,1,3,9,7};
        sort(arr, arr.length);
        print(arr, arr.length);
        
        int arr1[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr1, arr1.length);
        print(arr1, arr1.length);

    }

    //sorting dscending order
    public static void dSort(int arr[], int size){
        for(int i=1; i<size; i++){
            int num = arr[i];
            int j=i;
            while(j>0 && arr[j-1]<num){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]= num;
        }
    }

    //sorting ascending order
    public static void sort(int arr[],int size){
        for(int i=1; i<size; i++){
            int num = arr[i];
            int j=i;
            while(j>0 && arr[j-1]> num){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=num;
        }
    }

    //utility function to print the element of the array.
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
