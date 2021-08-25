package DSA;
public class Count_all_possible_path_to_go_from_left_top_to_right_bottom_of_matrix {
    public static void main(String[] args) {
        int m =1;
        int n =3;
        System.out.println(r_n_paths(m, n));
    }

    //this is recursive solution having exponential time complexity.
    static int number_of_paths(int m, int n){
        if(m==1 || n==1){
            return 1;
        }
        return number_of_paths(m-1, n) + number_of_paths(m, n-1);
    }

    //this is recursive memoization technique
    static int r_n_paths(int m, int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

       
        return  r_n_compute(m,n,dp);
    }
    
    static int r_n_compute(int m, int n, int dp[][]){
        if (m==1 || n== 1) {
           return 1; 
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        return dp[m][n] = r_n_compute(m-1, n, dp) + r_n_compute(m, n-1, dp);
    }
}
