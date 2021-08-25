package DSA;
public class Longest_Increasing_subsequence {
    public static void main(String[] args) {
        int arr[] ={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int n = arr.length;
        System.out.println(compute_longest_increasing_subsequence(arr, n));
    }
    
    //time complexity is o(n2) and space complexity is o(n)
    static int compute_longest_increasing_subsequence(int arr[], int n){
            int lis[] = new int[n];
            lis[0] =1;

            for(int i=1; i<n; i++){
                lis[i] = 1;
                for(int j=0; j<i; j++){
                    if(arr[j] < arr[i]){
                        lis[i] = Math.max(lis[i], lis[j]+1);
                    }
                }
            }
            int res = lis[0];

            for(int i=0; i<n; i++){
                res = Math.max(res, lis[i]);
            }
        return res;
    }
    
}
