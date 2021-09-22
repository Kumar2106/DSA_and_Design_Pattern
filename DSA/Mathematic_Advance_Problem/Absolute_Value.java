package DSA.Mathematic_Advance_Problem;

public class Absolute_Value {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(absolute(i));
    }

    public static int absolute(int i){
        if (i<0) {
            return i* -1;
        }
        return i;
    }
}
