package DSA;
import java.util.HashMap;

public class Common_element_in_all_row {
    public static void main(String[] args) {
        int mat[][] =
    {
        {1, 2, 1,  8},
        {3, 7, 8,  1},
        {8, 7, 7,  1},
        {8, 1, 2,  9},
    };

    common_element(mat, 4);
    }

    static void common_element(int arr[][], int n){
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0; i<n; i++){
           map.put(arr[0][i], 1);
       }

       for(int i=1; i<n; i++){
           for(int j=0; j<n; j++){
                if (map.get(arr[i][j]) != null && map.get(arr[i][j]) ==i){
                    map.put(arr[i][j],i+1);

                    if (i==n-1) {
                        System.out.print(arr[i][j] +" ");
                    }
                }

                
           }
       }


    }
}
