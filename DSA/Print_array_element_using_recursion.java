package DSA;
public class Print_array_element_using_recursion {
    public static void main(String[] args) {
        int arr[] = {4,2,1};
        print(arr,0);
    }

    static void print(int arr[], int start){
            if(start == arr.length-1){
                System.out.print(arr[start]);
                return;
            }
            System.out.print(arr[start]+" ");
            print(arr, start+1);

    }
}
