package DSA;
public class SubSet_sum_problem {
    public static void main(String[] args) {
        int arr[]= {3,34,4,12,5,2};
        int n = arr.length;
        int sum = 9;
        System.out.println("Is there any subset with the given sum "+is_subset(arr,n,sum));

    }
    static boolean is_subset(int arr[], int n, int sum){
        if (sum ==0) {
            return true; 
        }
        if(n==0){
            return false;
        }

        if (arr[n-1] > sum) {
            return is_subset(arr, n-1, sum);
        }

        return is_subset(arr, n-1, sum) || is_subset(arr, n-1, sum-arr[n-1]);
    }

    //this function is recursive memoization technique
    static boolean m_is_subset(int arr[], int n, int sum){
        int dp[][]= new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                dp[i][j] = -1;
            }
        }

        int result= r_m_is_susbset(arr, n, sum, dp);
    }

    //this function will give the answer 
    static int r_m_is_susbset(int arr[], int n, int sum, int dp[][]){
            if (sum == 0) {
                return 1;
            }
            if(n==0){
                return 0;
            }

            if (arr[n-1]>sum) {
               return dp[n][sum] = r_m_is_susbset(arr, n-1, sum, dp);
            }

         return dp[n][sum] = r_m_is_susbset(arr, n-1, sum, dp) ==1?1: r_m_is_susbset(arr, n-1, sum-arr[n-1], dp);
    }
}
