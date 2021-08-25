package DSA.Sorting_Basic;

public class Merge_Function_of_merge_Sort {
    public static void main(String[] args) {
        int a[]={10,20,40,20,30};
        int low =0;
        int mid = 2;
        int high= 4;
        merge(a, low, mid, high);
        print(a, a.length);
    }
    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int a[], int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int left[]=new int[n1];
        int righ[] = new int[n2];

        for(int i=0; i<n1;i++){
            left[i] = a[i];
        }

        for(int i=0; i<n2; i++){
            righ[i] = a[n1+i];
        }
        int i=0,j=0,k=0;

        while (i<n1 && j<n2) {
            if(left[i]<=righ[j]){
                a[k++]=left[i++];
            }else{
                a[k++]=righ[j++];
            }
        }

        while(i<n1){
            a[k++]=left[i++];
        }

        while(j<n2){
            a[k++]=righ[j++];
        }
    }
}
