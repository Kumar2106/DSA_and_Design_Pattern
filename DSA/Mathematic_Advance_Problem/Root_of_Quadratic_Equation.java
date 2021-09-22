package DSA.Mathematic_Advance_Problem;

public class Root_of_Quadratic_Equation {
    public static void main(String[] args) {
        int a=1,b=-7,c=12;
        roots(a, b, c);
    }

    public static void roots(int a, int b, int c){
        if (a ==0) {
            System.out.println("This is a linear Equation");
            return;
        }

        int d = (b*b) - 4*a*c;
        int square_root = (int) Math.sqrt(d);
        
        if (d> 0) {
            System.out.println("Root are real and different");
            System.out.println((-b-square_root)/(2*a)+ " "+ (-b+square_root)/(2*a));
        }
        else if(d == 0){
            System.out.println("Root are real and same");
            System.out.println((-b)/(2*a)+" "+(-b)/(2*a));
        }else{
            System.out.println("Root are complex");
            System.out.println((-b)/(2*a)+" +i"+" "+(-b)/(2*a)+" -i");
        }
    }
}
