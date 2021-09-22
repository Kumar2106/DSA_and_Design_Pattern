package DSA.Mathematic_Advance_Problem;

public class GP_Term {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int n = 2;
        System.out.println(termofGP(a, b, n));
    }

    public static int termofGP(int a, int b, int n){
        double r = a/b;

        return (int)(a* Math.pow(r, n-1));
    }
}
