package DSA.Sorting_Basic_Problem;



public class Selection_sort {
    public static void main(String[] args) {
    int arr[]={4,1,3,9,7};
    sort(arr, arr.length);
    print(arr, arr.length);
    
    System.out.println("");

    int arr1[]={10,9,8,7,6,5,4,3,2,1};
    sort(arr1,arr1.length);
    print(arr1, arr1.length);

    }
    //sorting function
    public static void sort(int arr[], int size){
        for(int i=0; i<size; i++){
            int min = Integer.MAX_VALUE;
            int index =0;
            for(int j=i; j<size; j++){
                if (min>arr[j]) {
                    min=arr[j];
                    index =j;
                }
            }
            swap(arr, i, index);
        }
    }

    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //utility function to swap the element in the array
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
