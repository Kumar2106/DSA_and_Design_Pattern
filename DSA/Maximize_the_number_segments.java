package DSA;
public class Maximize_the_number_segments {
    public static void main(String[] args) {
        int l= 11;
        int choice[]={2,3,5};
        System.out.print("The maximum number of segments is "+max(l, choice));
    }

    static int max(int l,int choice[]){
        int max= Integer.MIN_VALUE;
        if(l<=0){
            return 0;
        }
        for(int i=0; i<3; i++){
            if (l>=choice[i]) {
                int count = 1+ max(l-choice[i],choice);
                max= Math.max(count, max);
            }
        }
        return max;
    }
}
