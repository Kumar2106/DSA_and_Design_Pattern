package DSA.Sorting_Basic;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] ={5,2,6,3,12,8};
        int p=5;
        int l=0;
        int h=5;
       System.out.println("Sorting using Naive Partion");
       NaiveQuickSort_Partion(arr, l, h, p);
       print(arr, arr.length);

       System.out.println("");

       int arr1[] ={12,3,2,7,6}; 
       System.out.println("Sorting using Lomuto Partion");
       Lomuto_Partion(arr1, l, arr1.length-1);
       print(arr1, arr1.length);

       System.out.println("");

       System.out.println("Sorting using Hoare's Partion");
       HoaresPartion(arr, l, h);
       print(arr, arr.length);
    }
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //this is naive partioning algorithm for quickSort
    public static void NaiveQuickSort_Partion(int arr[], int l , int h, int p){
        int temp[] = new int[h-l+1]; int index =0;

        for(int i=l; i<=h; i++){
            if (arr[i]<=arr[p]) {
                temp[index++]=arr[i];
            }
        }

        for(int i=l; i<=h; i++){
            if(arr[i]>arr[p]){
                temp[index++]=arr[i];
            }
        }

        for(int i=l; i<=h; i++){
            arr[i] =temp[i];
        }
    }

    public static void Lomuto_Partion(int arr[], int l, int h){
        int pivot = arr[h];
        int i= l-1;

        for(int j=l; j<h-1; j++){
            if (arr[j]<pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
    }

    //utility function for swapping
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    //Hoare's Partition
    public static int HoaresPartion(int arr[], int l, int h){
        int pivot = arr[l];
        int i=l-1,j=h+1;

        while (true) {
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]> pivot);

            if (i>=j) {
                return j;
            }

            swap(arr, i, j);
        }
    }
    

}
