package DSA;
public class Reach_a_score {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(count(n));
    }

    static long count(int n){
        if (n==0) {
            return 1;
        }

        if(n<0){
            return 0;
        }

        return count(n-3)+count(n-5)+count(n-10);
    }
}
