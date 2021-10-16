package DSA.Bit_Magic_Advance;

public class Count_total_set_bits {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(countSetBitso(n));
    }

    public static int countSetBits(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            sum+= setBits(i);
        }
        return sum;
    }

    public static int setBits(int num){
        int count =0;
        while(num != 0){
            if((num & 1) == 1){
                count++;
            }

            num = num >>>1;
        }

        return count;
    }

    public static int countSetBitso(int n){
        if(n == 0){
            return 0;
        }
        
        int x = powerOf2(n);
       int res = n - (1<<x);
       return (1<<(x-1))*x + (res+1)+countSetBits(res);
            
        }
        
        //return max power of 2
        public static int powerOf2(int n){
            int x = 0;
            while((1<<x)<=n){
                x++;
            }
            
            return x-1;
        }

}
