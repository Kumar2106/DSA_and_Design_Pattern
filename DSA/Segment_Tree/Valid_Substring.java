package DSA.Segment_Tree;

import java.util.*;

public class Valid_Substring {
    public static void main(String[] args) {
        String S = ")(";
        System.out.println(findMaxLen(S));
    }

    static int findMaxLen(String s) {
        int n = s.length();
      // Variables for left and right
        // counter maxlength to store
        // the maximum length found so far
        int left = 0, right = 0;
        int maxlength = 0;
 
        // Iterating the string from left to right
        for (int i = 0; i < n; i++) {
 
            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(')
                left++;
            else
                right++;
 
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid and
            if (left == right)
                maxlength = Math.max(maxlength,
                                     2 * right);
 
            // Reseting the counters when the
            // subsequence becomes invalid
            else if (right > left)
                left = right = 0;
        }
 
        left = right = 0;
 
        // Iterating the string from right to left
        for (int i = n - 1; i >= 0; i--) {
 
            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(')
                left++;
            else
                right++;
 
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid and
            if (left == right)
                maxlength = Math.max(maxlength,
                                     2 * left);
 
            // Reseting the counters when the
            // subsequence becomes invalid
            else if (left > right)
                left = right = 0;
        }
        return maxlength;  
    }
}
