package DSA.Sorting_Basic;

public class Count_Sort_General_Purpose_Implementation {
    public static void main(String[] args) {
        int arr[]={1,4,4,1,0,1};
        sort(arr, 5, arr.length);
        print(arr, arr.length);

    }

    public static void sort(int arr[], int k, int n){
        //consider max to be the largest element in the array
        //then k = max+1;
        int count[]= new int[k];

        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<k; i++){
            count[i] = count[i-1]+count[i];
        }

        int output[]= new int[n];

        //traversing from right side is making the algorithm stable.
        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }

        for(int i=0; i<n; i++){ 
            arr[i]=output[i];
        }
    }

    //utility function to print the array
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
