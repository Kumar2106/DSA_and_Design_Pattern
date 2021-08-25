package DSA;
/**
 * Split_binary_string_into_sub_string_of_equal_0_and_1
 */
public class Split_binary_string_into_sub_string_of_equal_0_and_1 {

    public static void main(String[] args) {
     String str = "0100110101";    
     System.out.println(count_sub_string(str, str.length()) );
    }

    static int count_sub_string(String s, int n){

       int count = 0;

       int count_0  =0;
       int count_1 = 0;

       for(int i=0; i<n; i++){
           if(s.charAt(i) == '1')
           count_1++;

           if (s.charAt(i) == '0') {
               count_0++;
           }

           if (count_0 == count_1) {
               count++;
           }
       }
       if (count == 0) {
           return -1;
       }
       return count;
    }

}