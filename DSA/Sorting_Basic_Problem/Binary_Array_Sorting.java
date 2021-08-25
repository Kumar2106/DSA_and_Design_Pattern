package DSA.Sorting_Basic_Problem;

public class Binary_Array_Sorting {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0};
        sort(arr, arr.length);
        print(arr, arr.length);

        int arr1[]={1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};
        sort(arr1,arr1.length);
        print(arr1, arr1.length);
    }

    public static void sort(int arr[], int size){
        int count[]= new int[2];

        for(int i=0; i<size; i++){
            count[arr[i]]++;
        }

        int index =0;

        for(int i=0; i<2; i++){
            for(int j=0; j<count[i]; j++){
                arr[index++]=i;
            }
        }
    }

    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
