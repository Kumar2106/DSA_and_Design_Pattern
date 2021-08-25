package DSA;
import java.util.ArrayList;
import java.util.List;

public class All_subsequence_in_a_string {
    static List<String> al = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        find_subsequence(s, "");
        System.out.println(al);
    }

    static void find_subsequence(String s, String ans){
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        find_subsequence(s.substring(1), ans +s.charAt(0));

        find_subsequence(s.substring(1), ans);
    }


}
