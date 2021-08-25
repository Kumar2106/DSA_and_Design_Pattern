package DSA;
public class Max_Sub_Array {
    public static void main(String[] args) {
        int arr[] = {511,-824,584,568,-309,526};
        int n = arr.length;
        System.out.println(max_sub(arr, n));
    }

    static int max_sub(int arr[],int n){
        int curr=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curr+= arr[i];
            if(curr> max){
                System.out.println("Adding"+i);
                max = curr;
            }

            if(curr < 0){
                System.out.println("curr zero"+i);
                curr=0;
            }

        }
        return max;
    }
}
