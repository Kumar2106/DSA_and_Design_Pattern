package DSA.Mathematic_Advance_Problem;
public class Primarlity_Test {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Prime "+isPrime(n));
    }

    public static boolean isPrime(int number){
        int sqrt = (int)Math.sqrt(number);

        for(int i=2; i<=sqrt; i++){
            if (number %i == 0) {
                return false;
            }
        }
        return true;
    }
}
