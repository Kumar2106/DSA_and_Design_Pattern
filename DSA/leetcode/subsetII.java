package DSA.leetcode;

import java.util.*;

public class subsetII {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);

        for (List<Integer> list : result) {
                for(Integer elemeInteger: list){
                   
                }
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
         output.add(new ArrayList());
         
         ArrayList<Integer> curr = new ArrayList<>();
         recur(output,nums,curr,0,nums.length);
         return output;
         
     }
     
     public static void recur(List<List<Integer>> output,int[] nums ,ArrayList<Integer> curr,int index,int n){
         if(index >= n){
             return;
         }
         curr.add(nums[index]);
         output.add(curr);
         recur(output,nums,curr,index+1,n);
         curr.remove(curr.size()-1);
         recur(output,nums,curr,index+1,n);
         
     }
}
