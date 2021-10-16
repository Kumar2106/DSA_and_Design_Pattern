package DSA.Arrays_Advance;

public class maximum_index {
    public static void main(String[] args) {
        int A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int N = A.length;
        System.out.println(maxIndexDiff(A, N));
    }

    static int maxIndexDiff(int A[], int N) { 
    
        int min_diff = -1;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if (A[j] >= A[i]) {
                    min_diff = Math.max(min_diff, j-i);
                }
            }
        }
        return min_diff;
    }
}
