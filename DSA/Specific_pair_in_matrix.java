package DSA;
public class Specific_pair_in_matrix {
    public static void main(String[] args) {
        int mat[][] = {
            { 1, 2, -1, -4, -20 },
            { -8, -3, 4, 2, 1 },
            { 3, 8, 6, 1, 3 },
            { -4, -1, 1, 7, -6 },
            { 0, -4, 10, -5, 1 }
         };

         System.out.println(findMaxValue_best_Approach(mat, mat.length));
    }

    static int findMaxValue(int arr[][], int n){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n-1; i++) 
        for(int j=0; j<n-1; j++)
        for(int a=i+1; a<n; a++)
        for(int b = j+1; b<n; b++)
        if (max < (arr[a][b] - arr[i][j])) {
            max = arr[a][b] - arr[i][j];
        }

        return max;
    }

    static int findMaxValue_best_Approach(int mat[][], int N){
        int maxValue = Integer.MIN_VALUE;
        int maxArr[][] = new int[N][N];

        maxArr[N-1][N-1] = mat[N-1][N-1];

        int maxv  = mat[N-1][N-1];

        for(int i=N-2; i>=0; i--){
            if (mat[i][N-1] > maxv) {
                maxv = mat[i][N-1];
            }
            maxArr[i][N-1] = maxv;
        }

        for (int i = N-2; i>=0; i--) {
            for(int j=N-2; j>=0; j--){
                if (maxArr[i+1][j+1] - maxArr[i][j] > maxValue) {
                    maxValue = maxArr[i+1][j+1] - maxArr[i][j];
                }

                maxArr[i][j] = Math.max(mat[i][j], Math.max(maxArr[i][j+1], maxArr[i+1][j]));
            }
        }
        return maxValue;
    }
}
