package DSA;

public class Search_an_elment {
    public static void main(String[] args) {
        int n =4;
        int arr[]={1,2,3,4};
        int key =3;
        System.out.println(search(arr, n, key));
    }

    public static int search(int arr[], int n, int key){

        for(int i=0; i<n; i++){
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
