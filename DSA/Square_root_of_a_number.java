package DSA;

public class Square_root_of_a_number {
    public static void main(String[] args) {
       int num = 35;
       System.out.println(squareRoot(num)); 
       System.out.println(osquareRoot(num));
    }

    //t= o(squareroot of num)
    public static int squareRoot(int num){
        int i =1;
        while (i*i <=num) {
            i++;
        }
        return (i -1);
    }
    //t=o(log num)
    public static int osquareRoot(int num){
        int low =1, high =num;
        int ans =1;
        while (low<=high) {
            int mid = (low+high)/2;
            int msquare = mid*mid;

            if (msquare == num) {
                return mid;
            }

            if (msquare<num) {
                ans = mid;
                low = mid+1;
            }

            if (msquare> num) {
                high = mid-1;
            }

        }

        return ans;
    }
}
