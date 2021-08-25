package DSA.Sorting_Basic_Problem;

public class Radix_Sort {
    public static void main(String[] args) {
        int arr[]={1,9,345,2};
        rSort(arr, arr.length);
        print(arr, arr.length);
    }

    public static void rSort(int arr[], int size){
        int max = arr[0];
        for(int i=1; i<size; i++){
            max = Math.max(max, arr[i]);
        }

        for(int exp=1; max/exp>0; exp=exp*10){
            counting_sort(arr,size,exp);
        }
    }

    public static void counting_sort(int arr[], int size, int exp){
        int count []= new int[10];

        for(int i=0; i<size; i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++){
            count[i]=count[i]+count[i-1];
        }

        int output[]=new int[size];

        for(int i=size-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i=0; i<size; i++){
            arr[i]=output[i];
        }
    }

    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
