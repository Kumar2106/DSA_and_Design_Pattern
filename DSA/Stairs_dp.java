package DSA;
import java.util.Arrays;

public class Stairs_dp {
    public static void main(String[] args) {
        int n=10;
        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);
        dp[1] =1;
        dp[2] =2;
       System.out.println(ways(n, dp));

    }

    // this solution takes exponential time
    static int ways(int n){
        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        int res = ways(n-1) + ways(n-2);
        return res;
    }

    //this solution will take o(n) time and o(n) space
    static int ways(int n , int dp[]){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
       
        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] =ways(n-1)+ways(n-2);

    }
}
