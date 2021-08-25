package DSA.Sorting_Basic;

public class Quick_Sort_Using_Hoares_Partition {
    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        Quick_Sort(arr, 0, arr.length-1);
        print(arr, arr.length);
    }

    //quickSort using hoare's partition
    public static void Quick_Sort(int arr[], int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
           //TODO: There is some silly mistake
            Quick_Sort(arr, l, p);
           
            Quick_Sort(arr, p+1, h);
           
        }
    }

    //partiton algorithm 
    public static int partition(int arr[], int l, int h){
       int pivot = arr[l];
       int i=l-1;
       int j=h+1;
       while(true){
           do{
               i++;
           }while(arr[i]<pivot);

           do{
               j--;
           }while(arr[j]>pivot);

           if(i>=j){
               return j;
           }

           swap(arr, i, j);
       }
    }

    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    //utility function to swap the array elment 
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
