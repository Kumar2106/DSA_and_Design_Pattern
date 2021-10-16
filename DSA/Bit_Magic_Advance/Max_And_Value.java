package DSA.Bit_Magic_Advance;

public class Max_And_Value {
    public static void main(String[] args) {
        int arr[] = {4, 8, 12, 16};
        int N = 4;
        int max = 0;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if( (arr[i]& arr[j])>max ){
                    max = arr[i] & arr[j];
                }
            }
        }

        System.out.println(max);
    }
}
