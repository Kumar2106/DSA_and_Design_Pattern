package DSA.Sorting_Basic_Problem;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[]={4 ,1 ,3 ,9 ,7};
        Mergesort(arr, 0, arr.length-1);
        print(arr, arr.length);
    }
    
    public static void Mergesort(int arr[], int l, int r){
        if (l<r) {
            int m = l+(r-l)/2;
            Mergesort(arr, l, m);
            Mergesort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int left[]= new int[n1];
        int right[]=new int[n2];

        for(int i=0; i<n1; i++){
            left[i]=arr[l+i];
        }

        for(int i=0; i<n2; i++){
            right[i]=arr[m+1+i];
        }

       int i=0, j=0, index=l;

       while(i<n1 && j<n2){
           if(left[i]<=right[j]){
               arr[index++]=left[i++];
           }else{
               arr[index++]=right[j++];
           }
       }

       while(i<n1){
           arr[index++]=left[i++];
       }

       while(j<n2){
           arr[index++]=right[j++];
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
