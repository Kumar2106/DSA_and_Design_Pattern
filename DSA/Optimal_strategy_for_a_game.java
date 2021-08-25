package DSA;
public class Optimal_strategy_for_a_game {
    public static void main(String[] args) {
        int N=4;
        int A[]={8,15,3,7};
        System.out.println("The max of the game is"+optimal(A, 0,N-1));
    }

    //this is the recursive solution for the optimal strategy
   static int mainSol(int arr[], int n){
       int sum=0;
       for(int i=0; i<arr.length; i++){
           sum+= arr[i];
       }

       return sol(arr,0,n-1,sum);
   }

   static int sol(int arr[], int i, int j, int sum){
        if(j == i+1){
            return Math.max(arr[i],arr[j]);
        }
        return Math.max(sum-sol(arr, i+1, j, sum-arr[i]),sum-sol(arr,i,j-1,sum-arr[j]));
   }

   //this is second recursive solution for optimal strategy for the game
   static int optimal(int arr[], int i, int j){
       if (i+1 == j) {
           return Math.max(arr[i], arr[j]);
       }

       return Math.max(arr[i]+Math.min(optimal(arr, i+2, j),optimal(arr, i+1, j-1)), arr[j]+Math.min(optimal(arr, i+1, j-1), optimal(arr, i, j-2)));
   }
}
