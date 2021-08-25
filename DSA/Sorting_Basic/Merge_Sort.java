package DSA.Sorting_Basic;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[]={1,5,2,7,2,4,9,11};
        mergeSort(arr, 0, arr.length-1);
        print(arr, arr.length);

    }

    public static void mergeSort(int arr[], int l, int r){
        //l is first index and r is the index of the last element
        if (r>l) {
           int m = l+(r-l)/2;//this statement is used here because (l+r)/2 can cuse overflow if the size of the array is large
           mergeSort(arr, l, m);
           mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[i];
        }

        for(int i=0; i<n2; i++){
            right[i] = arr[n1+i];
        }

        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }

        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
