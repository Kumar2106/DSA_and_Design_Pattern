package DSA;
import java.util.Arrays;

public class Longest_common_sequence {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "AC";
       System.out.println("The longest Common sequence"+ m_r_lcs(s1, s2, s1.length(), s2.length()));
    }

    static int longest_common_sequence(String s1, String s2){
        int index = -1;
        int count =0;

        for(int i=0; i<s1.length(); i++){
            for(int j=(index<0?0:index); j<s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                    index = j+1;
                }
            }
        }
        return count;
    }

    //recursive solution for the longest common sequence
    static int recursive_longest_commmon_sequence(String s1, String s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if (s1.charAt(m-1) == s2.charAt(n-1)) {
           return 1+recursive_longest_commmon_sequence(s1, s2, m-1, n-1);
        }
        return Math.max(recursive_longest_commmon_sequence(s1, s2, m-1, n), recursive_longest_commmon_sequence(s1, s2, m, n-1));
    }

    //recursive and memoization technique for the longest common sequence
    static int m_r_lcs(String s1, String s2, int m, int n){
        int memo[][]= new int[m+1][n+1];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                memo[i][j] = -1;
            }
        }
         m_t_r_solution(s1, s2, m, n, memo);
         return memo[m-1][n-1];

    }

    //recursive and memo table used for the longest common sequence
    //this is a wrong solution
    static int m_t_r_solution(String s1, String s2, int m ,int n, int memo[][]){
            //if there is no element in the s1 or s2
            if (m==0 || n==0) {
             return 0; 
            }
            //if longest common sequence has been already been computed
            if(memo[m-1][n-1] != -1){
                return memo[m-1][n-1];
            }
            else if(s1.charAt(m-1) == s2.charAt(n-1)){
                return memo[m-1][n-1] =1+ m_t_r_solution(s1, s2, m-1, n-1, memo);
            }

            return memo[m-1][n-1]= Math.max(m_t_r_solution(s1, s2, m-1, n, memo), m_t_r_solution(s1, s2, m, n-1, memo));

    }
}
