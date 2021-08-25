package DSA;
public class Power_using_recursion {
    public static void main(String[] args) {
        int n =3;
        int p =5;
        System.out.println("The result of n to the power p is"+ power(n, p));
    }
    static int power(int n, int p){
        if (p==0) {
            return 1;
        }
        if(p == 1){
            return n;
        }
        return n*n*power(n, p-2);
    }
}
