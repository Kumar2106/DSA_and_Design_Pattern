package DSA;
public class Gcd_Euclid {
    
    public static void main(String[] args) {
       int fnum = 4;
       int snum = 16;
       System.out.println("GCD of "+ fnum +" "+ snum+" is "+ gcd(fnum, snum)); 
    }

    static int gcd(int fnum, int snum){
        if (snum%fnum == 0) {
            return fnum;
        }
        return gcd(snum%fnum,fnum);
    }
}
