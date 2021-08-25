package DSA;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Coin_Change_DP {
    
    public static void main(String[] args) {
        int sum=30;
        int n = 3;
        int coins[]={25,10,5};
        System.out.print(getCount_tab(coins, n, sum));
    }

    static int getCount(int coins[], int n, int sum){
        if(sum== 0){
            return 1;
        }

        if(n==0){
            return 0;
        }

        int res = getCount(coins, n-1, sum);

        if(coins[n-1]<=sum){
            res+=getCount(coins, n, sum-coins[n-1]);
        }

        return res;
    }

    //Top down approach(Tabulation)

    static int getCount_tab(int coins[], int n, int sum){
        int[] dp = new int[sum+1];

        Arrays.fill(dp, 0);
        dp[0] = 1;

        for(int i=0; i<n; i++){
            for(int j=coins[i]; j<=sum; j++){
                dp[j] +=dp[j-coins[i]];
            }
        }

        return dp[n];
    }
}
