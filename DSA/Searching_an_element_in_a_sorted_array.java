package DSA;

public class Searching_an_element_in_a_sorted_array {
    public static void main(String[] args) {
        int n = 6;
        int arr[]={1,2,3,4,5,6};
        int k = 6;
        System.out.println(search(arr, n, k));
        System.out.println(rSearch(arr, 0, n-1, k));
    }

    //this is the iterative approach
    public static int search(int arr[], int n, int k){
      
        int l=0,r=n-1;
        while (l<=r) {
            int mid = (l+r)/2;
            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] >k) {
                r = mid-1;
            }
            
            if (arr[mid]<k) {
                l=mid+1;
            }
        }

        return -1;
    }

    //this is the recursive approach
    public static int rSearch(int arr[],int start, int end, int k){
        if (start>end) {
            return -1;
        }
       int mid = (start+end)/2;
       if (arr[mid] == k) {
           return mid;
       }

       if (arr[mid]>k) {
           return rSearch(arr, start, mid-1, k);
       }

      
        return rSearch(arr, mid+1, end, k);
    }
}
