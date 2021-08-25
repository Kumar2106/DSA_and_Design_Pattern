package DSA;
import java.util.Arrays;

public class Valid_shuffle_of_two_number {
    public static void main(String[] args) {
        String first ="XY";
        String second = "12";
        String result = "Y1X2";
        if (valid_shuffle(first,second,result)) {
            System.out.println("This is valid shuffle of two string first and second");
        }else{
            System.out.println("This is not valid shuffle of two string");
        }
    }


    private static boolean valid_shuffle(String first, String second, String result){

        first = sort_String(first);
        second = sort_String(second);
        result = sort_String(result);

        int i=0,j=0,k=0;

        while (k< result.length()) {
            if (i < first.length() && first.charAt(i) == result.charAt(k)){
                i++;
            }
            else if (j < second.length() && second.charAt(j) == result.charAt(k) ){
                j++;
            }
            else{
                return false;
            }
            k++;
        }

        if(i< first.length() || j< second.length()){
            return false;
        }
       return true;
    }

    static String sort_String(String s){
        char char_array[] = s.toCharArray();
        Arrays.sort(char_array);

       return new String(char_array); 
    }

}
