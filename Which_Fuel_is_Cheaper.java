import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Which_Fuel_is_Cheaper
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		
		//no of test case:
		int t = in.nextInt();
		
		//current price of petrol
		int x = in.nextInt();
		
		//current price of diesel
		int y = in.nextInt();
		
		//increase in petrol
		int a = in.nextInt();
		
		//increase in diesel
		int b = in.nextInt();
		
		//no of months
		int k = in.nextInt();
		
		while(k-- > 1){
		    x+=a;
		    y+=b;
		}
		
		if(x<y){
		    System.out.println("PETROL");
		}else if(y<x){
		    System.out.println("DIESEL");
		}else{
		    System.out.println("SAME PRICE");
		}
		    
	}
}
