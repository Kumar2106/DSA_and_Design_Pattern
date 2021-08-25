package DSA;
public class Find_ncr {
    public static void main(String[] args) {
        int n = 4;
        int r = 1;
        System.out.print("ncr is "+ ncr(n, r));
    }

    static int ncr(int n, int r){
            return fact(n)/(fact(n-r)*fact(r));
    }

    static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
}
