package DSA.Sorting_Basic;

public class Count_Sort_Naive_Implementation {
    public static void main(String[] args) {
        int arr[]={1,4,4,1,0,1};
        sort(arr, arr.length);
        print(arr, arr.length);
    }

    //utility function to print the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[], int size){
        int temp[]= new int[size];

        for(int i=0; i<size; i++){
            temp[arr[i]]++;
        }

        int index =0;

        for(int i=0; i<size; i++){
            for(int j=0; j<temp[i]; j++){
                arr[index++]=i;
            }
        }
    }
}
