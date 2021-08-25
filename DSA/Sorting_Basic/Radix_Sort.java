package DSA.Sorting_Basic;

public class Radix_Sort {
    public static void main(String[] args) {
        int arr[]={319,212,6,8,100,50};
        rSort(arr, arr.length);
        print(arr, arr.length);
    }

    //sorting the array
    public static void rSort(int arr[], int size){
        int max = arr[0];
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max =arr[i];
            }
        }

        for(int exp=1; max/exp>0; exp=exp*10){
            Counting_Sort(arr, arr.length, exp);
        }
    }

    //counting sorting algorithm
    public static void Counting_Sort(int arr[], int n, int exp){
        int count[]= new int[10];

        for(int i=0; i<n; i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++){
            count[i]=count[i-1]+count[i];
        }

        int output[] = new int[n];

        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i=0; i<arr.length; i++){
            arr[i]= output[i];
        }
    }
    //utility function to print the element of the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
