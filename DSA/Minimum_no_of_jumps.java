package DSA;
public class Minimum_no_of_jumps {
    
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 7} ;
        System.out.println(minJumps_my_approach(arr));
    }

    static int minJumps(int[] arr){
        
        int jump=0,curr;
        int i=0;
        int n=arr.length;
        while(i<n){
            curr=arr[i];
            i+= curr;
            jump++;
            if(i > n || i == n){
                return jump;
            }
            
        }
        
        return jump;
     }

     static int minJumps_my_approach(int [] arr){

        int n = arr.length;
        int curr = arr[0];
        int jump=0;
        for (int i = 1; i <n;) {
             int next_step[] = next(arr, i+1, curr);
            if(i+1+next_step[0] >= n){
                return jump;
            }
            jump++;
            i=next_step[1];
            curr = arr[i];
        }

         return -1;
     }

     static int[] next(int arr[], int i, int curr){
         int max[]  = new int[2];
         max[0] =0;
         max[1]= i+1;
         for(int j=i; j<i+curr; i++){
                if(arr[j]> max[0]){
                    max[0] = arr[j];
                    max[1] =j;
                }
         }
         return max;
     }
}
