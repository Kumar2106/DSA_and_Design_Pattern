package DSA.Searching_Advance;

public class Two_repeated_element {
    public static void main(String[] args) {
        int array[] = {1,1,2,2};
        int N = 2;
        int result[] = twoRepeated(array, N);
        System.out.println("x "+result[0] + "y "+result[1]);
    }

    static void print_repeated(int arr[], int n){
        int count[] = new int[n+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<n+1; i++){
            if(count[i] == 2){
                System.out.print(i+" ");
            }
        }
    }

    public static int[] twoRepeated(int arr[], int N)
    {
       int xor =0;
       int size = arr.length;
       
       for(int i=0; i<size; i++){
           xor = xor ^ arr[i];
       }
       
       
       for(int i=1; i<N; i++){
           xor = xor ^i;
       }
       
       int rmsb = xor & -xor;
       
       int x = 0;
       int y =0;
       
       for(int i=0; i<size; i++){

           int a = arr[i] & rmsb;

           System.out.println(a);
           
           if(a!=0){
               x = x^arr[i];
           }else{
               y = y ^ arr[i];
           }
       }
       
       int result[] = new int[2];
       result[0] = x;
       result[1] = y;
       return result;
        
    }
}
