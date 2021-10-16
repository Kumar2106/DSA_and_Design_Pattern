package DSA.Codechef;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
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
