package DSA.Codechef;

import java.util.Scanner;

public class October_Long_Challenge {
    public static void main(String[] args) {
        Solid_Liquid_Solution();
    }

    public static void Solid_Liquid_Solution(){
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    if(a == 0){
		        System.out.println("Liquid");
		    }
		    else if(b == 0){
		        System.out.println("Solid");
		    }
		    else{
		        System.out.println("Solution");
		    }
		    
		    
		}
    }
}
