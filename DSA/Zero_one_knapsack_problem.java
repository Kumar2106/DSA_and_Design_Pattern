package DSA;
public class Zero_one_knapsack_problem {
    public static void main(String[] args) {
        int n=3;
        int w =3;
        int values[]={1,2,3};
        int weight[]={4,5,6};

        System.out.println("The maximum value that can be taken is"+ knapsack_recursive_memo(w, weight, values, n));

    }

    //this is recursive based  solution having time complexity exponential
    static int knapsack_recursive(int W,int weight[],int values[], int n){
        if (W ==0 || n==0) {
            return 0;
        }
        if(weight[n-1]>W){
            return knapsack_recursive(W, weight, values, n-1);
        }
        return Math.max(values[n-1]+knapsack_recursive(W-weight[n-1], weight, values, n-1), knapsack_recursive(W, weight, values, n-1));                                    
    }

    //this function will create dp array and return result
    static int knapsack_recursive_memo(int W, int weight[], int values[], int n){
        int dp[][]= new int[W+1][n+1];
        for(int i=0; i<=W; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }
        return knapsack_recursive_memo_solve(W, weight, values, n,dp);
    }

    //this will be the recursive function using memoization
    static int knapsack_recursive_memo_solve(int W,int weight[],int values[], int n, int dp[][]){
        if (W ==0 || n==0) {
            return 0;
        }
        if (dp[W][n] != -1) {
            return dp[W][n];
        }
        if(weight[n-1]>W){
            return dp[W][n-1]= knapsack_recursive(W, weight, values, n-1);
        }
        return dp[W][n]= Math.max(values[n-1]+knapsack_recursive(W-weight[n-1], weight, values, n-1), knapsack_recursive(W, weight, values, n-1));                                    
    }


}
