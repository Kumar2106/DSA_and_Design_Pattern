package DSA.Recursion_Advance;
import java.util.ArrayList;

public class Power_Set {
    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr="";
        ArrayList<String> result = new ArrayList<>();
        powerSet(str, index, curr, result);
        result.remove(result.size()-1);
        
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
 
    }

    static ArrayList<String> powerSet(String str, int index,
            String curr,ArrayList<String> result)
     
{
    int n = str.length();
 
    // base case
    if (index == n)
    {
       result.add(curr);
       return result;
    }
 
    // Two cases for every character
    // (i) We consider the character
    // as part of current subset
    // (ii) We do not consider current
    // character as part of current
    // subset
   
    powerSet(str, index + 1, curr + str.charAt(index),result);
    return powerSet(str, index + 1, curr,result);
 
}
}
