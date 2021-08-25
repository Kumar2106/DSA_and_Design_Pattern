package DSA;

public class Count_1_in_binary {
    public static void main(String[] args) {
        int n =8;
        int arr[]={1,0,0,0,0,0,0,0};
        System.out.println(count(arr, n));
    }

    public static int count(int arr[], int n){
        for(int i=n-1; i>0; i--){
            if (arr[i]==0 && arr[i-1] == 1) {
                return i;
            }
        }
        return 0;
    }
}
