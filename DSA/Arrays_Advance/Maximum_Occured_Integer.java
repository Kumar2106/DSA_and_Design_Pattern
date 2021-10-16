package DSA.Arrays_Advance;

public class Maximum_Occured_Integer {
    public static void main(String[] args) {
        int n = 5;
        int L[] = {1,5,9,13,21};
        int R[] = {15,8,12,20,30};
        int maxx = 30;
        System.out.println(maxOccured(L, R, n, maxx));
    }

    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr[] = new int[maxx];
        for(int i=0; i<n; i++){
            int start = L[i];
            int end = R[i];
            
            for(int j=start; j<=end; j++){
                arr[j-1]++;
            }
            
        }
        
        int max_count=arr[0];
        
        for(int i=1; i<maxx; i++){
            max_count = Math.max(max_count,arr[i]);
        }
        
        int result =0;
        
        for(int i=0; i<maxx; i++){
            if(arr[i] == max_count){
                result = i+1;
                
            }
        }
        return result;
          
      }
}
