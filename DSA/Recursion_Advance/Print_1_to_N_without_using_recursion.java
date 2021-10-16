package DSA.Recursion_Advance;
public class Print_1_to_N_without_using_recursion {
    public static void main(String[] args) {
        printR(1,6);
    }

    public static void printR(int start, int n){
       
        if (start != n) {
            System.out.print(start+" ");
            start++;
        }
        if (start == n) {
            return;
        }

        printR(start, n);
    }
}
