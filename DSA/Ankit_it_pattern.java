package DSA;
/**
 * Ankit_it_pattern
 */
public class Ankit_it_pattern {

    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            int sum =0;
            for(int j=1; j<=i; j++){
                if(j==i){
                    sum+=j;
                    System.out.print(j);
                }
                else{
                    sum+=j;
                    System.out.print(j+"+");
                }
            }
            System.out.println("="+sum);
        }
    }
}