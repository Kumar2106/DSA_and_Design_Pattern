package DSA;
public class The_sequence {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("The nth term for the sequence is"+ theseq(n));
    }
    static int theseq(int n){
        if (n==0){
            return 1;
        } 
            
        return n+n*(theseq(n-1));
    }
}
