package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;
//any series
//use for loop 1st starting num  N last add diff with updation
//within loop add incrementation with sum


public class GpSeries 
{
	public static void main(String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
	  float a,i,d=0, n,sum=0;

	  try {
	  System.out.print("Input the first number of the G.P. series: ");
	  a = sc.nextFloat();

	  System.out.print("Input the number or terms in the G.P. series: ");
	  n = sc.nextFloat();

	  System.out.print("Input the common ration of G.P. series: ");
	  d = sc.nextFloat();
	  }
	  catch( InputMismatchException | NumberFormatException e) 
	  {
		  System.out.println(" Invalid Input ");

		  System.out.print("Input the first number of the G.P. series: ");
		  a =sc.nextFloat();

		  System.out.print("Input the number or terms in the G.P. series: ");
		  n = sc.nextFloat();

		  System.out.print("Input the common ration of G.P. series: ");
		  d = sc.nextFloat();
		  
	  }
	  for ( i = 1,a=3; i <=n ; i++,a*=2) 
	  {
		  sum=sum+a;
		  
		  System.out.print( + a +" ");
	  }
		 System.out.print("\n");
	  System.out.print(" The Sum of the G.P = " +sum);
	 }     

}
