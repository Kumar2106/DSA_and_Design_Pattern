package DSA.Arrays_Advance;

public class who_has_the_majority {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
        int x = 4;
        int y = 5;
        System.out.println(majority(arr, x, y));
    }

    public static int majority(int arr[], int x, int y){
        int count_x =0;
        int count_y =0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == x) {
                count_x++;
            }else if(arr[i] == y){
                count_y++;
            }
        }

        if (count_x > count_y) {
            return x;
        }else if (count_y > count_x) {
            return y;
        }

        return x<y?x:y;
    }
}
