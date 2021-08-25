package DSA;
public class Palindrome_num {
    public static void main(String[] args) {
        String num = "5355";
        System.out.print(palindrome(num, 0, num.length()-1)+" is Palindrome");
    }

    static boolean palindrome(String num, int start, int end){
        
        if (start == end || start > end) {
            return true;
        }

        if (num.charAt(start) != num.charAt(end)) {
            return false;
        }

        return palindrome(num, start+1, end-1);
    }
}
