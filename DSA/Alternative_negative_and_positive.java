package DSA;
public class Alternative_negative_and_positive {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, -4, -1, 4};
        System.out.println("Array before sorting");
        print(arr);

       

        System.out.println("Array after sorting");
        print(arr);
    }

    private void _alternative_negative_positive(int arr[]){

        int n = arr.length;
        boolean alter = true;

        int i=0;
        int j;
        int buffer =0;
        while (i<n) {
            if(i % 2 == 0){
                    if (arr[i] >0) {
                        
                    }
            }else{

            }
          
        }

    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] +" ");
            }
    }
}
