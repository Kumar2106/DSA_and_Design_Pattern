package DSA;
import java.util.Arrays;

/**
 * Median_of_two_sorted_array_Of_different_size
 */
public class Median_of_two_sorted_array_Of_different_size {

    public static void main(String[] args) {
        int A[] = { 900 };
        int B[] = { 5, 8, 10, 20 };
 
        int N = A.length;
        int M = B.length;
 
        System.out.printf("%f", FindMedian(A, N, B, M));
    }

    //this function wil calculate the median of two number
    static float MO2(int a , int b){
        return (float) ((a+b)/2 );
    }

    //this function will calculate the median of three number
    static float MO3(int a, int b, int c){
        return a+b+c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
    }

    //this function will calculate the median of four number
     static float MO4(int a, int b, int c, int d){
        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        int min = Math.min(a, Math.min(b, Math.min(c, d)));

        return (float) (((a+b+c+d) - max - min )/2.0);
    }

    static float medianSingle(int arr[], int n){
        if(n==0){
            return -1;
        }

        if(n%2 == 0){
            return (float) ((double) (arr[n/2] +arr[n/2 -1])/2);
        }

        return arr[n/2];
    }

    static float FindMedianUtils(int A[], int B[], int N, int M ){
        if (N==0) {
            return medianSingle(B, M);
        }
        if(N==1){
            if (M==1) {
                return MO2(A[0], B[0]);
            }

            if (M % 2 ==1) {
                return MO2(B[M/2], (int)  MO3(A[0], B[M/2 -1], B[M/2 +1]));
            }
            return MO3(B[M/2], B[M/2 -1], A[0]);
        }
        else if (N==2) {
            if (M==2) {
                return MO4(A[0], A[1], B[0], B[1]);
            }
            if (M% 2 == 1) {
                return MO3(B[M/2], Math.max(A[0], B[M/2 -1]), Math.max(A[1], B[M/2+1]));
            }

            return MO4(B[M/2], B[M/2 -1], Math.max(A[0], B[M/2 -2]), Math.min(A[1], B[M/2+1]));
        }

        int indxA = (N-1)/2;
        int indxB = (M-1)/2;

        if (A[indxA] <= B[indxB]) {
            return FindMedianUtils(Arrays.copyOfRange(A, indxA, A.length),B,  N/2+1, M-indxA);
        }

        return FindMedianUtils(A, Arrays.copyOfRange(B, indxB, B.length), N/2+1, M);
    }

    static float FindMedian(int A[], int N, int B[], int M){
        if(N>M){
            return FindMedianUtils(B, A, M, N);
        }
        return FindMedianUtils(A, B, N, M);
    }

}